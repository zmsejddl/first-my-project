package section05_제어문_2.응용문제;

public class PRACTICE_05_06 {

	public static void main(String[] args) {

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k < (2*i)+1; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
