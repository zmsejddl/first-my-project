package section19_파일_입출력.바이트_기반_스트림03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EX19_03 {

	public static void main(String[] args) {

		//예제 19-3 1byte씩 출력하기
		
		OutputStream out = null;
		try {
			out = new FileOutputStream("write.txt", false);
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//객체가 사용중이라면 닫는다
				if(out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 13: OutputStream을 선언합니다
		 * 15: 파일 객체를 선언합니다
		 * 파일을 생성할 위치와 이어쓰기 옵션을 매개변수로 전달합니다
		 * 16~20: write() 메서드를 이용해 문자를 출력합니다
		 */
	}

}
