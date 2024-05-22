package section16_컬렉션_프레임워크.List_컬렉션03;

import java.util.ArrayList;
import java.util.List;

public class EX16_06 {

	public static void main(String[] args) {

		//예제 16-6 ArrayList 데이터 삭제
		
		List<Integer> list = new ArrayList<Integer>();
		
		//2의 배수를 넣는다
		for(int i = 1; i < 10; i++) {
			int temp = 2 * i;
			list.add(temp);
		}
		//출력
		System.out.println("리스트 값: " + list);
		
		//3번째 인덱스 내용 삭제
		list.remove(3);
		//숫자 타입의 데이터는 객체화 후 삭제
		list.remove(Integer.valueOf(10));
		
		System.out.println("리스트 값: " + list);
		
		/*
		 * 해설
		 * 23: 3번 인덱스 위치에 있는 값을 삭제합니다
		 * 25: 정수형 데이터는 index 번호와 구별할 수 없으므로 값을 통한 삭제를 할 경우에는 객체를 선언하여 삭제합니다
		 */
	}

}
