package array_apply;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArray array = new MyArray();
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1, 50);
		array.printAll();
		
		System.out.println("========");
		array.removeElement(1);
		array.addElement(40);
		array.printAll();
		
	}

}
