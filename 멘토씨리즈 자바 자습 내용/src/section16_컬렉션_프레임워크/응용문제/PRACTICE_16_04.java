package section16_컬렉션_프레임워크.응용문제;

import java.util.ArrayList;
import java.util.List;

public class PRACTICE_16_04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int temp = (int)(Math.random() * 100) + 1;
			list.add(temp);
		}
		System.out.println(list);
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)%2 == 0) {
				sum += list.get(i);
			}
		}
		System.out.println("짝수의 합: " + sum);
	}

}
