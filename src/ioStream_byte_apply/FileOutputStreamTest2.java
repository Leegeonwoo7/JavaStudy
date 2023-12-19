package ioStream_byte_apply;

import java.io.FileOutputStream;
import java.io.IOException;

//바이트 배열의 특정 위치에서부터 정해진 길이만큼쓰기
public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output2.txt")){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
