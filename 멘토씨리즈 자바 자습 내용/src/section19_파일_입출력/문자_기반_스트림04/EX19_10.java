package section19_파일_입출력.문자_기반_스트림04;

import java.io.FileWriter;

public class EX19_10 {

	public static void main(String[] args) {

		//예제 19-10 FileWriter 스트림
		
		FileWriter w = null;
		try {
			//FileOutputStream 처럼 이어쓰기, 덮어쓰기 모드 존재
			w = new FileWriter("fileText.txt", false);
			w.write('H');
			w.write('A');
			w.write('P');
			w.write('P');
			w.write('Y');
			w.write('\n');
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(w != null) {
					w.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 14: FileWriter 객체를 선언합니다
		 * 15~20: 한 문자씩 데이터를 출력합니다
		 * 21: 작성 완료하여 출력합니다
		 */
	}

}
