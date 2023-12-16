package customization_exception_handling;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		PasswordValidator pValidator = new PasswordValidator();
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		
		try {
			pValidator.setPassword(password);
			System.out.println("오류없음");
		}catch(PasswordException e){
			System.out.println(e.getMessage());
		}
		
	}

}
