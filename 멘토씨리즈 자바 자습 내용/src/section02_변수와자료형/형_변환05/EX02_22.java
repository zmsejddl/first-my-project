package section02_변수와자료형.형_변환05;

public class EX02_22 {

	public static void main(String[] args) {

		//예제 2-22 정수형간의 형 변환하기
		
		int i1 = 10;
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		//byte의 해당 범위(-128~127)를 넘었으므로 -128부터 1을 센다
	}

}
