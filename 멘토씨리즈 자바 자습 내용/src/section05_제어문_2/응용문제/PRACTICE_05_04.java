package section05_제어문_2.응용문제;

public class PRACTICE_05_04 {

	public static void main(String[] args) {

		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int num = 0;
		while(true) {
			num++;
			if(dice1 == dice2) {
				System.out.println(num);
				System.out.println(dice1);
				break;
			}
		}
	}

}
