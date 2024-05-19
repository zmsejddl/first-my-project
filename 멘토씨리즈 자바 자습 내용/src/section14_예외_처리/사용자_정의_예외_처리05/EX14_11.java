package section14_예외_처리.사용자_정의_예외_처리05;

public class EX14_11 extends Exception {

	//예제 14-11 사용자 정의 객체
	
	private String message;
	public EX14_11(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
