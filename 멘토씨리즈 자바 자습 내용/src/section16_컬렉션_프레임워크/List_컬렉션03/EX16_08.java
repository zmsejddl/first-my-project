package section16_컬렉션_프레임워크.List_컬렉션03;

import java.util.ArrayList;
import java.util.LinkedList;

public class EX16_08 {

	public static void main(String[] args) {

		//예제 16-8 ArrayList와 LinkedList 비교
		
		//ArrayList 선언
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//LinkedList 선언
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		//ArrayList 연속으로 데이터 추가
		long startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList 추가 시간: " + duration);
		
		//LinkedList 연속으로 데이터 추가
		startTime = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList 추가 시간: " + duration);
		
		startTime = System.nanoTime();
		//ArrayList 선택적 삽입
		arrayList.add(99, 100);
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList 삽입 시간: " + duration);
		
		startTime = System.nanoTime();
		//LinkedList 선택적 삽입
		linkedList.add(99, 100);
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList 삽입 시간: " + duration);
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList 지우기: " + duration);
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList 지우기: " + duration);
		
		/*
		 * 해설
		 * 18: 현재 시간을 nano초 단위로 가져옵니다
		 * 19~21: ArrayList에 1부터 1000000까지 삽입합니다
		 * 24~25: 소요된 시간을 체크하여 출력합니다
		 */
	}

}
