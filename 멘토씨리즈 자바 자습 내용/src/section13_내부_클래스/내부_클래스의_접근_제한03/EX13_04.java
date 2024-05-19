package section13_내부_클래스.내부_클래스의_접근_제한03;

public class EX13_04 {

	private class InClass {
		
		public void print() {
			System.out.println("접근을 private로 제한합니다");
		}
	}
	
	public InClass getInClass() {
		//인스턴스 클래스를 선언하여 리턴
		return new InClass();
	}
	
	public static void main(String[] args) {

		//예제 13-4 내부 클래스의 접근 제한
		
		EX13_04 permit = new EX13_04();
		permit.getInClass().print();
		
		/*
		 * 해설
		 * 5: 인스턴스 클래스를 private로 선언합니다
		 * 12~15: private로 선언된 객체를 받기 위해 메서드를 생성합니다
		 * 22: 메서드를 통해서 인스턴스 클래스를 받습니다
		 */
	}

}
