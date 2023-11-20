package review7;

public class PriorityAllocation implements Scheduler{
		public void getNextCall() {
			System.out.println("다음순서의 상담원에게 배분합니다.");
		}
		public void sendCallToAgent() {
			System.out.println("우선순위가 높은 고객에게는 높은 숙련도의 상담원을 배분합니다.");
		}
	}
