package section08_메서드.매개변수와_return02;

public class EX08_18 {

	//예제 8-18 return으로 메서드 빠져나가기
	
	void take(int m) {
		//return; 이 나올 때까지 무한 반복
		while(true) {
			if(m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다");
				return;
			}
			System.out.println("버스를 탑니다");
			m -= 1250;
		}
	}
}
