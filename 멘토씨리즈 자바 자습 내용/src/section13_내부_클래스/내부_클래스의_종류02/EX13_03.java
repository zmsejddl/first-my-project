package section13_내부_클래스.내부_클래스의_종류02;

public class EX13_03 {

	private int speed = 10;
	
	public void getUnit(String unitName) {
		
		class Unit {
			
			public void move() {
				System.out.println(unitName + "이 " + speed + " 속도로 이동합니다");
			}
		}
		
		Unit unit = new Unit();
		unit.move();
	}
	
	public static void main(String[] args) {

		//예제 13-3 지역 클래스 예제
		
		EX13_03 local = new EX13_03();
		local.getUnit("마린");
	}
	
	/*
	 * 해설
	 * 5: 인스턴스 변수를 선언합니다
	 * 7: 유닛의 이름을 매개변수로 하는 메서드를 선언합니다
	 * 9: 메서드 내부에 Unit 클래스를 생성합니다
	 * 16~17: 지역 클래스를 선언하여 사용합니다
	 */

}
