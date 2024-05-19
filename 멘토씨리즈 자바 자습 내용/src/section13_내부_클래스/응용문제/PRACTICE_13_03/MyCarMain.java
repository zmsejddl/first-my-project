package section13_내부_클래스.응용문제.PRACTICE_13_03;

public class MyCarMain {

	public static void main(String[] args) {

		MyCar mycar = new MyCar("쏘나타", 1000);
		MyCar.Promotion promotion = mycar.new Promotion();
		
		System.out.println(mycar.getInfo() + ", 할인금액: " + promotion.discount());
	}

}
