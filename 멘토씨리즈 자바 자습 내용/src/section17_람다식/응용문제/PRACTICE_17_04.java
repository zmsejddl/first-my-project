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
			System.out.println("두 수 " + n1 + "과 " + n2 + " 중 " + n1 +"이 더 큽니다");
		} else if(result == -1) {
			System.out.println("두 수 " + n1 + "과 " + n2 + " 중 " + n2 +"이 더 큽니다");
		} else {
			System.out.println("두 수 " + n1 + "과 " + n2 +"는 같습니다");
		}
	}

}
