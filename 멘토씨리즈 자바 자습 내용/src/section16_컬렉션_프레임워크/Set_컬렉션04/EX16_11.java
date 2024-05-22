package section16_컬렉션_프레임워크.Set_컬렉션04;

import java.util.HashSet;
import java.util.Set;

public class EX16_11 {

	public static void main(String[] args) {

		//예제 16-11 HashSet 데이터 삭제
		
		Set<String> set = new HashSet<String>();
		//데이터 삽입
		set.add("apple");
		set.add("mango");
		set.add("banana");
		set.add("melon");
		
		System.out.println("set items: " + set);
		
		//데이터 삭제
		set.remove("banana");
		set.remove("mango");
		
		System.out.println("set items: " + set);
		
		/*
		 * 해설
		 * 22~23: HashSet 데이터를 삭제합니다
		 */
	}

}
