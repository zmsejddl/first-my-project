package section15_기본_API_클래스.java_util패키지03;

import java.util.Calendar;

public class EX15_16 {

	public static void main(String[] args) {
		
		//예제 15-16 Calendar 클래스
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다");
		
		/*
		 * 해설
		 * 13~15: 상수 필드 값을 이용해 원하는 날짜의 정보를 얻습니다
		 * 이때, MONTH의 매개변수로 +1을 넘겨주는 이유는 Calendar 클래스는 0~11을 월의 값으로 반환해 주기 때문입니다
		 */
	}
}
