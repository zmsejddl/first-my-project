package section16_컬렉션_프레임워크.제네릭02;

public class EX16_02 {

	public static void main(String[] args) {
		
		//예제 16-2 데이터 저장 예제
		
		EX16_01 list = new EX16_01();
		
		//정수 입력
		list.add(10);
		//문자 저장
		list.add("문자");
		//숫자 저장
		list.add(10.33);
		
		//데이터 출력
		for(int i = 0; i < list.size(); i++) {
			//데이터 가져오기
			Object data = list.get(i);
			
			//저장된 데이터 타입이 어떤 타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수: " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수: " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열: " + (String)data);
			}
		}
		
		/*
		 * 해설
		 * 9: EX16_01 객체를 선언합니다
		 * 12~16: 다양한 타입의 데이터를 저장합니다
		 * 24~25: 어떤 타입의 데이터인지 검사한 후 타입에 맞게 형 변환하여 출력합니다
		 */
	}
}
