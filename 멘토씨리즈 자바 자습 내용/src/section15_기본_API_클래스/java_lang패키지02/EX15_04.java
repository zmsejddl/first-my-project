package section15_기본_API_클래스.java_lang패키지02;

public class EX15_04 {

	//예제 15-4 회원정보를 담는 Member 객체 만들기
	
	private int memberId;
	private String memName;
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemName() {
		return memName;
	}
	
	public void setMemName(String memName) {
		this.memName = memName;
	}

	//hashCode() 메서드를 override하여 객체의 고유 ID 반환
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		//비교 대상 객체가 Member 클래스이면
		if(obj instanceof EX15_04) {
			//타입 변환
			EX15_04 compare = (EX15_04)obj;
			//두 객체의 고유 ID를 비교
			if(this.memberId == compare.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	/*
	 * 해설
	 * 28~30: hashCode() 메서드를 override 하여 고유값인 ID를 반환합니다
	 * 33~46: equals() 메서드를 override 하여 객체가 지닌 ID 값을 비교하여 반환합니다
	 */
}
