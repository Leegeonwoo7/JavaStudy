package lamda_apply;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber myNumber = (x, y) -> x > y ? x : y;
		
		int max = myNumber.getMax(10, 20);
		System.out.println(max);
	}
}
