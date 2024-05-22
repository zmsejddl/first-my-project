package section16_컬렉션_프레임워크.Set_컬렉션04;

public class EX16_09 {

	//예제 16-9 TextMessage 객체
	
	//메시지를 식별하는 번호
	private int msgNumber;
	//메시지 내용
	private String msg;
	
	public EX16_09(int msgNumber, String msg) {
		this.msgNumber = msgNumber;
		this.msg = msg;
	}
	
	public int getMsgNumber() {
		return msgNumber;
	}
	
	public String getMsg() {
		return msg;
	}

	@Override
	public int hashCode() {
		//식별 번호 리턴
		return msgNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EX16_09) {
			EX16_09 compare = (EX16_09)obj;
			if(this.msg.equals(compare.getMsg())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	/*
	 * 해설
	 * 26~29: hashCode() 메서드를 override하여 msgNumber를 반환합니다
	 * 32~42: equals() 메서드를 override 하여 객체가 지닌 text 값을 비교해 반환합니다
	 */
}
