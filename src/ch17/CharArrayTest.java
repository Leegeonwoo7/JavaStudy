package ch17;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] charArr = new char[26];
		char ch = 'A';
		for(int i=0; i<charArr.length; i++) {
			charArr[i] = ch++; 
		}
		
		for(char alpha : charArr) {
			System.out.println(alpha + "," + (int)alpha);
		}

	}

}
