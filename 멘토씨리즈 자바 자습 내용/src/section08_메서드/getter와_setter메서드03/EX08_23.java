package section08_메서드.getter와_setter메서드03;

public class EX08_23 {

	public static void main(String[] args) {

		//예제 8-23 필드에 대한 접근 강화하기
		
		EX08_22 kim = new EX08_22();
		kim.setAge(-30);
		kim.setAge(30);
		System.out.println("kim의 나이는 " + kim.getAge() + "세입니다");
	}

}
