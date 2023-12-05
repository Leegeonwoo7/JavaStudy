package ch36;

public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.printAll();

	}

}
