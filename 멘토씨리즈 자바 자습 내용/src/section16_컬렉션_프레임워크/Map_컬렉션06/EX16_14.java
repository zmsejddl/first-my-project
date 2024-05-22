package section16_컬렉션_프레임워크.Map_컬렉션06;

import java.util.HashMap;
import java.util.Map;

public class EX16_14 {

	public static void main(String[] args) {

		//예제 16-14 HashMap 사용법
		
		//Map 선언
		Map<String, String> map = new HashMap<String, String>();
		//데이터 삽입
		//put(key, value);
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fail", "가을");
		map.put("winter", "겨울");
		//key가 중복될 경우 value 변경
		map.put("spring", "봄봄");
		//삭제
		map.remove("winter");
		
		//특정 키가 존재하는지 확인
		System.out.println("Is Exist Key: " + map.containsKey("winter"));
		//특정 값이 존재하는지 확인 - 중복은 신경쓰지 않고 존재하면 true
		System.out.println("Is Exist Value: " + map.containsValue("가을"));
		//key에 해당하는 값 가져오기
		System.out.println("get Data: " + map.get("spring"));
		
		/*
		 * 해설
		 * 13: HashMap을 선언합니다
		 * 16~19: HashMap에 데이터를 삽입합니다
		 * 21: Key가 중복일 경우, 기존 Key가 가진 데이터를 마지막에 입력된 데이터로 변경합니다
		 * 23: Key가 winter인 데이터를 삭제합니다
		 * 26: 검색하는 key가 존재하는지 확인합니다(true / false로 반환)
		 * 28: 검색하는 value가 존재하는지 확인합니다(value가 중복일 경우, 처음 만나는 value 값으로 판단)
		 * 30: key가 지닌 데이터를 반환합니다
		 */
	}

}
