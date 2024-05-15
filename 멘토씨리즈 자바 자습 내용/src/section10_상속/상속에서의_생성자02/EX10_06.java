package section10_상속.상속에서의_생성자02;

public class EX10_06 {

	public static void main(String[] args) {

		//예제 10-6 상속에서 생성자
		
		EX10_05 c1 = new EX10_05("박자바", 25, 11111);
		c1.enter();
		
		EX10_05 c2 = new EX10_05("송코딩", 20, 22222);
		c2.enter();
	}

}
