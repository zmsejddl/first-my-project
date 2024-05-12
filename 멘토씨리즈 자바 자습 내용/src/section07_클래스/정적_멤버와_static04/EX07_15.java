package section07_클래스.정적_멤버와_static04;

public class EX07_15 {	//클래스 선언

	public static void main(String[] args) {

		//예제 7-15 인스턴스
		
		EX07_14 stu1 = new EX07_14();
		stu1.studentName = "김고이";
		stu1.hello();
		System.out.println("학교는 " + EX07_14.schoolName + "입니다");
		EX07_14.goToSchool();
		
		EX07_14 stu2 = new EX07_14();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + EX07_14.schoolName + "입니다");
		EX07_14.goToSchool();
	}

}
