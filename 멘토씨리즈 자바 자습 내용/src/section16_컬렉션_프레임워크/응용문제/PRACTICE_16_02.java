package section16_컬렉션_프레임워크.응용문제;

import java.util.ArrayList;
import java.util.List;

public class PRACTICE_16_02 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
