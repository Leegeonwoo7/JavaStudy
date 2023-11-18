package ch25;

public class CalcTest {

	public static void main(String[] args) {
		Calc calc = new ComplateCalc();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		ComplateCalc complateCalc = new ComplateCalc();
		complateCalc.showInfo();
	}

}
