package ch15;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmpolyeeName("Lee");
		employeeLee.setDepartment("영업");
		System.out.println(Employee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmpolyeeName("Kim");
		employeeKim.setDepartment("인사");
		employeeKim.serialNum++;
		System.out.println(Employee.serialNum);
		System.out.println(employeeLee.serialNum);
	}

}
