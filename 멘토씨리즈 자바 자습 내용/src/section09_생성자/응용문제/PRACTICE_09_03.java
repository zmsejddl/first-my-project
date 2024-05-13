package section09_생성자.응용문제;

public class PRACTICE_09_03 {

	public static void main(String[] args) {

		Computer computer1 = new Computer("삼송");
		computer1.logo();
	}

}

class Computer {
	String brand;
	
	Computer(String name){
		brand = name;
	}
	
	void logo() {
		System.out.println("사랑해요 " + brand);
	}
}