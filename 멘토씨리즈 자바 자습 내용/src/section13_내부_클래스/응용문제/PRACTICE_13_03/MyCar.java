package section13_내부_클래스.응용문제.PRACTICE_13_03;

public class MyCar {

	private int price;
	private String myName;
	public MyCar(String myName, int price) {
		this.myName = myName;
		this.price = price;
	}
	
	public String getInfo() {
		String str = "차량: " + myName + ", 가격: " + price;
		return str;
	}
	
	public class Promotion {
		public int discount() {
			int discount = 0;
			discount = price / 100;
			return discount;
		}
	}
}
