package section10_상속.이차_상속05;

public class EX10_23 extends EX10_22 {

	//예제 10-23 N차 상속
	
	EX10_23(int peopleNum) {	
		super(peopleNum);	//EX10_22 클래스의 생성자 호출
	}

	@Override
	void takePerson() {	//EX10_22 클래스의 takePerson() 오버라이딩
		super.takePerson();	//EX10_22 클래스의 takePerson() 메서드 호출
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다");
	}

	@Override
	void ride() {	//EX10_21 클래스의 ride() 오버라이딩
		System.out.println("시속 50km/h 로 천천히 달립니다");
	}
	
	
	
	
}
