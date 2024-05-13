package section08_메서드.응용문제;


public class PRACTICE_08_05 {

	public static void main(String[] args) {
		
		Person1 lee = new Person1();
		lee.setAge(-10);
		lee.setAge(30);
		System.out.println("lee의 나이는 " + lee.getAge() + "세입니다");
	}

}


class Person1 {
	
	private int age;
		
	void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요");
			return;
		} else {
			age = num;
		}
	}
		
	int getAge() {
		return age;
	}
		
	
}