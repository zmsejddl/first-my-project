package section10_상속.상속에서의_생성자02;

public class EX10_05 extends EX10_04 {	//자식 클래스 선언

	int memberId;
	
	public EX10_05(String name, int age, int memberID) {
		super(name, age);	//super 메서드를 통해서 부모 생성자에 매개변수 전달
							//부모 객체 생성!
		this.memberId = memberID;
	}
	
	void enter() {
		System.out.println("회원번호: " + memberId + " (" + name + ", " + age + "세) 님 입장하셨습니다");
		//name, age는 부모 클래스에게 상속받은 필드입니다
	}
}
