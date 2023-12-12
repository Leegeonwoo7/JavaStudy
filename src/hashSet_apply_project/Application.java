package hashSet_apply_project;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WordManager wordManager = new WordManager();
		
		System.out.println("단어를 입력하세요 (종료: 'exit'): ");
		
		while(true) {
			String input = sc.nextLine();
			if(input.equals("exit")) {
				break;
			}
			
			wordManager.addWord(input);
		}
		wordManager.findDuplicates();
		
		sc.close();
	}

}
