package section15_기본_API_클래스.java_util패키지03;

import java.util.Calendar;
import java.util.Scanner;

public class EX15_17 {

	public static void main(String[] args) {
		
		//예제 15-17 Calendar 클래스를 이용해 달력 만들기
		
		//Calendar 객체 생성 (오늘의 정보)
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		//Calendar 클래스는 월의 시작이 0부터 시작
		cal.set(year, month - 1, 1);
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		//지정한 달의 시작하는 요일을 구함
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//달력 시작 날의 주말 처리
		for(int i = 1; i < week; i++) {
			System.out.println("\t");
		}
		
		for(int i = 1; i < lastOfDate; i++) {
			System.out.printf("%d\t", i);
			//토요일에 날짜를 표시하고 줄 바꿈 하는 코드
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
		sc.close();
		
		/*
		 * 해설
		 * 28: 월의 마지막 일자를 반환합니다
		 * 30: 시작하는 주의 위치를 구합니다
		 * 33~35: 시작하는 위치 전까지 공백을 넣습니다
		 * 37~44: 달력 날짜를 입력합니다
		 */
	}
}
