package ch16;
//	싱글톤패턴
public class Company {
	private static Company Instance = new Company();
	
	private Company() {	}
	
	public static Company getInstance() {
		return Instance;
	}
}
