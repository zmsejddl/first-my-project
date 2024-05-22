package section16_컬렉션_프레임워크.List_컬렉션03;

import java.util.ArrayList;
import java.util.List;

public class EX16_04 {

	public static void main(String[] args) {

		//예제 16-4 ArrayList 추가
		
		//리스트 선언
		List<String> list = new ArrayList<String>();
		
		//데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		System.out.println("리스트 내용1: " + list);
		
		//3번째 위치에 삽입
		list.add(2, "수박");
		
		System.out.println("리스트 내용2: " + list);
		
		/*
		 * 해설
		 * 13: String 타입의 데이터를 저장하는 리스트를 선언합니다
		 * 16~18: 데이터 삽입
		 * 21: 리스트는 toString()이 Override 되어 있으므로 그대로 출력할 수 있습니다
		 */
	}

}
