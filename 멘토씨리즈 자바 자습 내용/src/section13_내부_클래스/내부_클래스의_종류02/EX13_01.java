package section13_내부_클래스.내부_클래스의_종류02;

class Calculator {
	private int val1;	//인스턴스 멤버
	private int val2;
	
	//생성자를 통한 데이터 입력
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public class Calc {
		
		public int add() {
			return val1 + val2;
		}
	}
}

public class EX13_01 {

	public static void main(String[] args) {

		//예제 13-1 인스턴스 클래스
		
		Calculator cal = new Calculator(10, 11);	//외부 클래스 선언
		Calculator.Calc c = cal.new Calc();		//인스턴스 클래스 선언
		System.out.println("합: " + c.add());
		
		/*
		 * 해설
		 * 8: 생성자를 통해 데이터를 입력받습니다
		 * 13: 인스턴스 클래스를 구현합니다
		 * 16: 외부 클래스의 멤버를 이용해 계산합니다
		 * 27: 계산기 클래스를 선언합니다. 매개변수로 10과 11을 줍니다
		 * 28: 인스턴스 클래스 객체를 생성합니다
		 * 29: 메서드 실행 결과를 출력합니다
		 */
	}

}
