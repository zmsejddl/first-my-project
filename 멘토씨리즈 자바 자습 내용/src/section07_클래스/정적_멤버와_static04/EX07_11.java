package section07_클래스.정적_멤버와_static04;

public class EX07_11 {	//클래스 선언

	public static void main(String[] args) {

		//예제 7-11 인스턴스 멤버
		
		EX07_10 father = new EX07_10();
		EX07_10 son = new EX07_10();
		
		father.address = "인천";
		System.out.println(son.address);
	}

}
