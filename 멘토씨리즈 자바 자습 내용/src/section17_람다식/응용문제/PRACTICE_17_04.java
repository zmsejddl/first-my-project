package section17_람다식.응용문제;

interface Compare {
	int compareTo(int num01, int num02);
}

public class PRACTICE_17_04 {

	public static void main(String[] args) {

		Compare compare = (n1, n2) -> {
			return n1 > n2 ? 1 : n1 < n2 ? -1 : 0;
		};
		
		int n1 = 20;
		int n2 = 10;
		int result = compare.compareTo(n1, n2);
		
		if(result == 1) {
			System.out.println("n1이 n2보다 크다");
		} else if(result == -1) {
			System.out.println("n1이 n2보다 작다");
		} else {
			System.out.println("n1과 n2는 같다");
		}
	}

}
