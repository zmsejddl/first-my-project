package section15_기본_API_클래스.응용문제;

class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age; 
	}
	
	
}

public class PRACTICE_15_01 {

	public static void main(String[] args) {
		
		User user = new User("김철수", 22);
		System.out.println(user);
	}	
}
