package section11_다형성과_타입_변환.instanceof_연산자03;

class Animal {}
class Pig extends Animal {}
class Cow extends Animal {}

class Farm {
	void sound(Animal animal) {
		if(animal instanceof Pig) {	//animal 변수에 담긴 객체의 타입이 Pig이면,
			System.out.println("꿀꿀");
		} else {	//animal 변수에 담긴 객체의 타입이 Pig가 아니면,
			System.out.println("음메");
		}
	}
}

public class EX11_15 {

	public static void main(String[] args) {

		//예제 11-15 instanceof 연산자
		
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}

}
