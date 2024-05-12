package section07_클래스.클래스의_구성03;

public class 혼자코딩해보기 {

	public static void main(String[] args) {

		Tree tree = new Tree();
		
		System.out.println("나무 이름은 " + tree.name + "입니다");
	}

}

class Tree {
	
	String name = "자작나무";
}