package section10_상속.이차_상속05;

public class EX10_22 extends EX10_21 {

	//예제 10-22 N차 상속
	
	int peopleNum;	//승객 수
	
	EX10_22(int peopleNum) {
		this.peopleNum = peopleNum;	//승객 수 초기화
	}
	
	void takePerson() {
		System.out.println("승객이 버스에 탔습니다");
		peopleNum++;
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "명입니다");
	}
}
