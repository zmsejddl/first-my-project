package section08_메서드.응용문제;

public class PRACTICE_08_03 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.introduce("철수");
		stu.introduce("영희");
	}

}

class Student {
	void introduce(String name) {
		System.out.println("안녕하세요, 제 이름은 " + name + "입니다");
	}
}