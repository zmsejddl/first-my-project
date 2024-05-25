package section18_스레드.스레드_동기화03;

public class EX18_08 {

	//예제 18-8 Bank 클래스 메서드 동기화 처리
	
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public synchronized void addMoney(int money) {
		this.money += money;
	}
	
	/*
	 * 해설
	 * 13: addMoney() 메서드를 동기화 합니다
	 */
}
