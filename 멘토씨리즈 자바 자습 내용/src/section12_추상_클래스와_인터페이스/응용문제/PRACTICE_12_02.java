package section12_추상_클래스와_인터페이스.응용문제;

abstract class Bike {
	int wheel;
	abstract int getWheel();
	
	Bike(int wheel) {
		this.wheel = wheel;
	}
	
	void info() {
		System.out.println("이 자전거는 " + wheel + "발 자전거입니다");
	}
}

class ChildBike extends Bike {

	ChildBike(int wheel) {
		super(wheel);
	}

	@Override
	int getWheel() {
		return 0;
	}
	
}
public class PRACTICE_12_02 {

	public static void main(String[] args) {
		
		Bike b = new ChildBike(2);
		
		ChildBike cb = new ChildBike(4);
		cb.info();
	}

}
