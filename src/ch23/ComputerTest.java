package ch23;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer computer = new Computer(); 추상클래스이므로 인스턴스생성 불가능
		
		Desktop desktop = new Desktop();
		desktop.runDesktop();
		
		MyNotebook myNotebook = new MyNotebook();
		myNotebook.runMyNotebook();
	}

}
