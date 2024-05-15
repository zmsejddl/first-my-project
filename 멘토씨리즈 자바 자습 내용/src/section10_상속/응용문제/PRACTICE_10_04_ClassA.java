package section10_상속.응용문제;

public class PRACTICE_10_04_ClassA {

	private int a;
	
	private PRACTICE_10_04_ClassA(int a) {
		this.a = a;
	}
	
	public void methodA() {
		System.out.println("ClassA클래스의 methodA() 메서드입니다.");
		System.out.println("필드 a의 값은 " + a + "입니다");
	}
}
