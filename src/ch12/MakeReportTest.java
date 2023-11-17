package ch12;

import java.io.IOException;

public class MakeReportTest {

	public static void main(String[] args) throws IOException{
		MakeReport makeReport = new MakeReport();
		makeReport.setInfo();
		MakeReport makeReport2 = new MakeReport();
		makeReport2.setInfo();
		String report = makeReport.getReport();
		String report2 = makeReport2.getReport();
		System.out.println(report);
		System.out.println(report2);
	}

}
