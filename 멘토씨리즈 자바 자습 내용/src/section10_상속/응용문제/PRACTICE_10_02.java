package section10_상속.응용문제;

class Person {
	void printHello() {
		System.out.println("안녕하세요");
	}
}

class Student extends Person {
	
}

public class PRACTICE_10_02 {

	public static void main(String[] args) {

		Person p = new Person();
		p.printHello();
		
		Student s = new Student();
		s.printHello();
	}

}
