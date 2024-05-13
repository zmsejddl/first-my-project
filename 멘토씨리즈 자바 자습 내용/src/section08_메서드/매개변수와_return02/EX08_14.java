package section08_메서드.매개변수와_return02;

public class EX08_14 {

	//예제 8-14 result를 반환하는 메서드 정의
	
	public int sum(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		
		return result;	//매개변수로 받은 값을 모두 더한 result 값을 다시 반환함
	}
}
