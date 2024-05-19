package section13_내부_클래스.응용문제;

public class PRACTICE_13_04 {

	public int plus(int value) {
		
		class Cal {
			public int add() {
				return value;
			}
		}
		
		Cal cal = new Cal();
		return cal.add();
	}
	
	public static void main(String[] args) {

		PRACTICE_13_04 ie = new PRACTICE_13_04();
		System.out.println(ie.plus(10));
	}

}
