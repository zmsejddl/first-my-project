package section18_스레드.스레드_상태04;

public class EX18_13 {

	//예제 18-13 저장 클래스
	
	private int stackCount = 10;	//기본 10개를 지닌다
	public synchronized void addStack(int stackCount) {
		this.stackCount = stackCount;
		if(this.stackCount >= 10) {
			System.out.println("===스레드 깨우기===");
			notify();	//잠자는 스레드를 깨운다
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		try {	//현재 남아있는 것보다 꺼낼 것이 많다면...
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;	//0개로 변경한다
			} else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("===짐 없음 대기===");
				wait();	//스레드를 대기한다
				System.out.println("===짐 없음 완료===");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getStackCount() {
		return this.stackCount;
	}
	
	/*
	 * 해설
	 * 7: 짐은 기본 10개로 시작합니다
	 * 10~13: 짐이 10개 이상일 때 대기 중인 스레드를 깨웁니다
	 * 24~25: 짐이 0일때 스레드를 멈춥니다
	 */
}
