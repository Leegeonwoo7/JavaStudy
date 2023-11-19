package review6;

public class BeginnerLevel implements PlayerLevel{
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("점프하지 못합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("돌지 못합니다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 초급자 레벨입니다. *****");
	}
}
