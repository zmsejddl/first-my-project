package section08_메서드.매개변수와_return02;

public class EX08_15 {

	public static void main(String[] args) {

		//예제 8-15 result를 반환하는 메서드 호출
		
		int[] nums = {500, 200};	//배열 생성
		EX08_14 calc = new EX08_14();	//EX08_14 객체 생성
		//calc 인스턴스의 sum 메서드를 호출하여 return된 결과값을 출력
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다");
	}

}
