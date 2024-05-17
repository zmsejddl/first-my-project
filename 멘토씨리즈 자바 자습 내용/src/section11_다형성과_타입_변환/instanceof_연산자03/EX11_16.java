package section11_다형성과_타입_변환.instanceof_연산자03;

class Animal1 {}
class Pig1 extends Animal {}

public class EX11_16 {

	public static void main(String[] args) {

		//예제 11-16 instanceof 연산자와 '==' 연산자의 차이
		
		Pig p1 = new Pig();
		Pig p2 = new Pig();
		Animal a = p1;
		
		if(a instanceof Pig) {
			System.out.println("객체 변수 a는 Pig 타입으로 생성된 객체입니다");
		}
		
		if(a == p1) {
			System.out.println("a와 p1은 같은 객체를 참조하고 있습니다");
		}
		
		if(a != p2) {
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않습니다");
		}
		
		/*
		 * TIP
		 * A instanceof B: 객체 변수 A가 객체의 타입 B로 생성된 것인지 확인합니다
		 * C == D: 객체 변수 C와 객체 변수 D가 같은 객체를 참조하고 있는지 확인합니다
		 */
	}

}
