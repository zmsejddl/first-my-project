package section04_제어문_1.if_else_if문05;

public class EX04_07 {

	public static void main(String[] args) {

		//예제 4-7 if-else if 문1
		
		int favorite = 7;
		
		if(favorite < 5) {	//1번 조건문
			System.out.println("좋아하는 숫자가 5보다 작다");	//1번 구문
		} else if(favorite > 5) {	//2번 조건문
			System.out.println("좋아하는 숫자는 5보다 크다");	//2번 구문
		} else {
			System.out.println("좋아하는 숫자가 5이다");
		}
	}

}
