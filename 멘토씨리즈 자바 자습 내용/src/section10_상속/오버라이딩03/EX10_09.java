package section10_상속.오버라이딩03;

public class EX10_09 {	//클래스 선언

	public static void main(String[] args) {

		//예제 10-9 메서드 오버라이딩
		
		EX10_08 s = new EX10_08();
		s.powerOn();	//EX10_08 클래스에서 오버라이딩된 메서드가 호출
		s.powerOff();	//EX10_07 클래스의 메서드가 호출
		
		EX10_07 c = new EX10_07();
		c.powerOn();	//EX10_07 클래스의 메서드가 호출
		c.powerOff();	//EX10_07 클래스의 메서드가 호출
	}

}
