package section11_다형성과_타입_변환.instanceof_연산자03;

class Animal2 {
	
	void cry() {}	//<-텅 빈 메서드
}

class Pig2 extends Animal2 {

	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow2 extends Animal2 {

	@Override
	void cry() {
		System.out.println("음메");
	}
}

class Farm2 {
	void sound(Animal2 animal) {
		animal.cry();	//<- 매개변수 참조 객체의 오버라이딩된 메서드를 호출
	}
}
public class EX11_17 {

	public static void main(String[] args) {

		//예제 11-17 메서드 오버라이딩
		
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}

}
