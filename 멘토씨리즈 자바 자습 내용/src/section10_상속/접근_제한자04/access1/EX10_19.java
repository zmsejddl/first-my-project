package section10_상속.접근_제한자04.access1;

public class EX10_19 {	//클래스 선언

	//예제 10-19 접근 제한자 private
	
	public int a;
	
	private EX10_19(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드입니다.");
	}
}
