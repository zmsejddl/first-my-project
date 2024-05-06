package section03_연산자.단항_연산자03;

public class EX03_06 {

	public static void main(String[] args) {

		//예제 3-6 증감 연산자 위치에 따른 결과
		
		int x = 1;
		
		System.out.println(x++);	//x(=1)가 먼저 출력되고 난 후
		System.out.println(x);		//x에 +1이 더해져 2가 됨
		System.out.println(++x);	//x(=2)에 +1이 더해져 3이 된 x가 출력
	}

}
