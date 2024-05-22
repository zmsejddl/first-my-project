package section16_컬렉션_프레임워크.List_컬렉션03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 혼자코딩해보기 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 30 + 1);
			list.add(temp);
		}
		
		System.out.println(list);
		
		System.out.println("최대값: " + Collections.max(list) + ", 최솟값: " + Collections.min(list));
	}

}
