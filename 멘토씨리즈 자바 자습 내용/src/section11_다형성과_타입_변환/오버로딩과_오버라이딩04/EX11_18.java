package section11_다형성과_타입_변환.오버로딩과_오버라이딩04;

class Parent {
	
	public void display() {
		System.out.println("부모 클래스의 display() 메서드입니다");
	}
}

class Child extends Parent {
	
	//오버라이딩된 display() 메서드
	public void display() {
		System.out.println("자식 클래스의 display() 메서드입니다");
	}
	
	//오버로딩된 display() 메서드
	public void display(String str) {
		System.out.println(str);
	}
}
public class EX11_18 {

	public static void main(String[] args) {

		//예제 11-18 오버로딩과 오버라이딩
		
		Child ch = new Child();
		ch.display();
		ch.display("오버로딩된 display() 메서드입니다");
		
		/*
		 * TIP
		 * 오버로딩: 자바는 매개변수의 자료형/개수/순서를 기반으로 메서드를 구별하므로 
		 * 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 구현하고 필요에 따라 메서드를 선택해 사용할 수 있습니다
		 * 오버라이딩: 부모 클래스에게 상속받은 메서드를 재정의하여 자식 클래스용 메서드를 구현하고
		 * 자식 객체를 통해 메서드를 호출하면 오버라이딩된 메서드가 호출됩니다
		 */
	}

}
