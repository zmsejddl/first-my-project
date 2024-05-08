package section05_제어문_2.중첩for문03;

public class 혼자코딩해보기 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}

}
