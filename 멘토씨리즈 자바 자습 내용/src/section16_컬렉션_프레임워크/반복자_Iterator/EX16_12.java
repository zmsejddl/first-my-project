package section16_컬렉션_프레임워크.반복자_Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EX16_12 {

	public static void main(String[] args) {

		//예제 16-12 List의 Iterator
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//Iterator 객체 가져오기
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		//반환할 요소가 있는지 검사
		while(iter.hasNext()) {
			//요소 반환
			int val = iter.next();
			System.out.println("list 데이터[" + (count++) + "]: " + val);
		}
		
		/*
		 * 해설
		 * 13: 데이터를 List로 만들어 반환합니다
		 * 15: List의 Iterator 객체를 가져옵니다
		 * 18: While 문의 조건으로 Iterator가 순회할 수 있는지 검색합니다
		 * 20~21: 데이터를 반환하여 출력합니다
		 */
	}

}
