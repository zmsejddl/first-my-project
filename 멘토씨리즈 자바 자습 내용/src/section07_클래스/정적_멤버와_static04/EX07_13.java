package section07_클래스.정적_멤버와_static04;

public class EX07_13 {	//클래스 선언

	public static void main(String[] args) {
		
		//예제 7-13 정적 멤버
		
		System.out.println(EX07_12.schoolName);	//정적 필드 호출
		EX07_12.goToSchool();	//정적 메서드 호출
	}
}
