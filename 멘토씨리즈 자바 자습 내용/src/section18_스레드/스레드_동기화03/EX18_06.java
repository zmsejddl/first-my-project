package section18_스레드.스레드_동기화03;

public class EX18_06 {

	//예제 18-6 스레드를 사용한 입금
	
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
}
