package section08_메서드.getter와_setter메서드03;

public class EX08_21 {

	public static void main(String[] args) {

		//예제 8-21 마음대로 수정 가능한 필드
		
		EX08_20 kim = new EX08_20();
		kim.age = -30;
		System.out.println("kim의 나이는 " + kim.age + "세입니다");
	}

}
