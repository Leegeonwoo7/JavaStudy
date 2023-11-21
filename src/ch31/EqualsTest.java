package ch31;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student("Lee", 123);
		Student std2 = new Student("Lee", 123);
		
		System.out.println(std1==std2); //주소값은 다르지만
		System.out.println(std1.equals(std2)); //논리적으로는 같게구현
		System.out.println(std1.hashCode());
		
		System.out.println(System.identityHashCode(std1)); //실제 해시코드
		System.out.println(System.identityHashCode(std2));
		
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent.toString());
	}

}
