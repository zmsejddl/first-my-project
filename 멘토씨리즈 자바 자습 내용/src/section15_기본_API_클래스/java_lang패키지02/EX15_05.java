package section15_기본_API_클래스.java_lang패키지02;

import java.util.HashSet;
import java.util.Set;

public class EX15_05 {

	public static void main(String[] args) {

		//예제 15-5 객체를 저장하는 메인 클래스
		
		EX15_04 mem1 = new EX15_04();
		EX15_04 mem2 = new EX15_04();
		
		mem1.setMemberId(100);
		mem1.setMemName("홍길동");
		
		mem2.setMemberId(100);
		mem2.setMemName("홍길동");
		
		//Set은 데이터를 저장하는 자료 구조
		//중복 데이터를 허용하지 않는다
		Set<EX15_04> list = new HashSet<EX15_04>();
		list.add(mem1);
		list.add(mem2);
		
		//Set 객체에 저장된 데이터 크기 출력
		System.out.println("데이터 크기: " + list.size());
		
		/*
		 * 해설
		 * 23~25: 데이터의 중복을 허용하지 않는 특징을 가지고 있습니다
		 * 28: Set에 저장된 데이터의 크기(개수)를 출력합니다
		 */
	}

}
