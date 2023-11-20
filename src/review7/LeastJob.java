package review7;

public class LeastJob implements Scheduler{
	public void getNextCall() {
		System.out.println("다음순서의 상담원에게 배분합니다.");
	}
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원을 우선으로 배분합니다.");
	}
}
