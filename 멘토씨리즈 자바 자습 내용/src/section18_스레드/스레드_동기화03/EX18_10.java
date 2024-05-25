package section18_스레드.스레드_동기화03;

public class EX18_10 {

	//예제 18-10 Bank 클래스 블록 동기화 처리
	
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
}
