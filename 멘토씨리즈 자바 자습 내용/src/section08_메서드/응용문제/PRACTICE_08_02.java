package section08_메서드.응용문제;

public class PRACTICE_08_02 {

	public static void main(String[] args) {

		Person p = new Person();
		for(int i = 0; i < 3; i++) {
			p.printHello();
		}
	}

	
}

class Person {
	void printHello() {
		System.out.println("Hello");
	}
}