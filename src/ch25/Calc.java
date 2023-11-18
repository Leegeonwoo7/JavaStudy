package ch25;

public interface Calc {
	static final int ERROR = -9999999;
	
	public int add(int num1, int num2);
	public int substract(int num1, int num2);
	public int times(int num1, int num2);
	public int divide(int num1, int num2);
}
