package ch15;

public class Employee {
	public static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String department;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmpolyeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInfo() {
		System.out.println(employeeName + "의 부서는 " + department + "이고 고유번호는 " + serialNum + "입니다.");
	}
}
