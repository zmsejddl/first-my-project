package section04_제어문_1.switch문06;

public class EX04_10 {

	public static void main(String[] args) {

		//예제 4-10 switch 문1
		
		int num = 7;
		
		switch(num) {
		case 1 :
			System.out.println("num은 1이다");
			break;
		case 7 :
			System.out.println("num은 7이다");
			break;
		default :
			System.out.println("num은 1도 7도 아니다");
		}
		
		//if-else if 문에서 가장 마지막 구문인 else를 생략할 수 있었던 것처럼,
		//switch 문에서도 default: 구문을 생략할 수 있다
	}

}
