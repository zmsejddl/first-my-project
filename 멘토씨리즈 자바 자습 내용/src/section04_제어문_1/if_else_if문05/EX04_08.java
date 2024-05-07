package section04_제어문_1.if_else_if문05;

public class EX04_08 {

	public static void main(String[] args) {

		//예제 4-8 if-else if 문2
		
		int favorite = 7;
		
		if(favorite > 5) {	//1번 조건문
			System.out.println("좋아하는 숫자가 5보다 크다");	//1번 구문
		} else if(favorite == 7) {	//2번 조건문
			System.out.println("좋아하는 숫자는 7이다");
		}
		
		//1번 조건식이 true라서 2번 조건식이 true라도, 2번 조건식은 실행되지 않고 바로 if-else 문을 빠져나간다
	}

}
