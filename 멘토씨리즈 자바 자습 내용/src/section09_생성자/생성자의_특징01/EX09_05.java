package section09_생성자.생성자의_특징01;

public class EX09_05 {	//클래스 선언

	//예제 9-5 매개변수 2개로 객체 생성하기
	
	String name;
	int age;
	
	EX09_05(String n, int a){
		name = n;
		age = a;
	}
	
	void introduce() {
		System.out.println("안녕하세요, 저는 " + age + "세 " + name + "입니다");
	}
}
