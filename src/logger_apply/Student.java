package logger_apply;

public class Student {
	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName) {
		if(studentName == null) {
			throw new StudentNameFormatException("이름을 입력해주세요");
		}
		if(studentName.split(" ").length > 3) {
			throw new StudentNameFormatException("이름이 너무 깁니다.");
		}
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return studentName;
	}
}
