package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();
	
	private String line = "======================================\n";
	private String header = "이름\t주소\t\t전화번호\n";
	
	private String name;
	private String address;
	private String phoneNum;
	
	public void setInfo() throws IOException{
		System.out.println("정보를 입력하세요. (ex 이름,주소,핸드폰번호)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		String[] arr = new String[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = st.nextToken();
		}
		this.name = arr[0];
		this.address = arr[1];
		this.phoneNum = arr[2];
	}
	
	private void getHeader() {
		buffer.append(line);
		buffer.append(header);
		buffer.append(line);
	}
	
	private void getContent() {
		buffer.append(name + "\t");
		buffer.append(address + "\t\t");
		buffer.append(phoneNum + "\n");
	}
	
	private void getFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		getHeader();
		getContent();
		getFooter();
		return buffer.toString();
	}
}
