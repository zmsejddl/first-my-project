package section09_생성자.응용문제;

public class PRACTICE_09_05 {

	public static void main(String[] args) {

		Book b1 = new Book("어린왕자", 300);
		Book b2 = new Book();
	}

}

class Book {
	String title;
	int pages;
	
	Book() {
		
	}
	
	Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
}