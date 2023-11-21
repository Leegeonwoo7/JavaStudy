package ch31;

public class Student implements Cloneable{		
	private String studentName;
	private int studentNum;
	
	Student(String studentName, int studentNum){
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	@Override
	public String toString() {
		return studentName + "," + studentNum;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		else return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
