package ch28;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.x();
		myClass.y();
		myClass.myMethod();
		System.out.println();
		
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		

	}

}
