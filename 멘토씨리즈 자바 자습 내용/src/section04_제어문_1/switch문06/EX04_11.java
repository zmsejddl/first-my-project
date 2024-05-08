package section04_제어문_1.switch문06;

public class EX04_11 {

	public static void main(String[] args) {

		//예제 4-11 switch 문2 <break 제외> 
		
		int num = 7;
		
		switch(num) {
			case 1 :
				System.out.println("num은 1이다");
			case 7 :
				System.out.println("num은 7이다");
			default : 
				System.out.println("num은 1도 7도 아니다");
		}
		
		//break;가 없다면 조건에 맞는 case를 시작으로 뒤따라오는 모든 case 구문이 실행된다
	}

}
