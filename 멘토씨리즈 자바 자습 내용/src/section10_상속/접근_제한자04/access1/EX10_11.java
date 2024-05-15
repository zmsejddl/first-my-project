package section10_상속.접근_제한자04.access1;

public class EX10_11 {	//클래스 선언

	//예제 10-11 접근 제한자 public
	
	public int a;
	
	public EX10_11(int a) {
		this.a = a;
	}
	
	public void printA() {
		System.out.println("PublicA 클래스의 printA() 메서드입니다");
	}
}
