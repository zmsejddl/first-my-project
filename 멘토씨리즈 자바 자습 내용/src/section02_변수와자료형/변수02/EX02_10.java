package section02_변수와자료형.변수02;

public class EX02_10 {

	public static void main(String[] args) {

		//예제 2-10 2개의 변수에 저장된 데이터 바꾸기
		
		int myAge = 20;
		int yourAge = 30;
		int tempAge;
		
		tempAge = myAge; //1. myAge에 저장된 데치터를 tempAge에 복사해둔다
		//tempAge = 20, myAge = 20
		myAge = yourAge; //2. myAge에 yourAge의 데이터를 복사한다
		//myAge = 30, yourAge = 30
		yourAge = tempAge; //3. tempAge에 저장해둔 myAge 데이터를 yourAge에 저장한다
		//yourAge = 20, tempAge = 20
		
		System.out.println(myAge);
		System.out.println(yourAge);
	}

}
