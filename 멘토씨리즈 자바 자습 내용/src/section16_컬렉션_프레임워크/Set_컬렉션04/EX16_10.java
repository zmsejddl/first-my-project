package section16_컬렉션_프레임워크.Set_컬렉션04;

import java.util.HashSet;
import java.util.Set;

public class EX16_10 {

	public static void main(String[] args) {

		//예제 16-10 HashSet 메인 클래스
		
		Set<EX16_09> msgSet = new HashSet<EX16_09>();
		//메시지 객체 생성
		EX16_09 msg1 = new EX16_09(1001, "안녕하세요");
		EX16_09 msg2 = new EX16_09(1001, "안녕하세요");
		EX16_09 msg3 = new EX16_09(1001, "안녕하세요");
		EX16_09 msg4 = new EX16_09(1002, "안녕하세요");
		EX16_09 msg5 = new EX16_09(1003, "안녕");
		//set에 추가
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		//저장된 크기
		System.out.println("사이즈: " + msgSet.size());
		
		//출력
		for(EX16_09 msg : msgSet) {
			System.out.println("번호: " + msg.getMsgNumber() + ", 메세지: " + msg.getMsg());
		}
		
		/*
		 * 해설
		 * 14~18: TextMessage 객체를 선언하고 데이터를 입력합니다
		 * 20~24: HashSet 컬렉션에 데이터들을 저장합니다
		 * 26: 저장된 데이터의 크기를 출력합니다
		 * msgNumber와 msg는 같은 객체를 중복 저장하지 않아, 5개를 저장했지만 크기는 3이 출력됩니다
		 */
	}

}
