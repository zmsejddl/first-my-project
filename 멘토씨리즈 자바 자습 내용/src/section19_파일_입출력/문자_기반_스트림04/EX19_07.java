package section19_파일_입출력.문자_기반_스트림04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EX19_07 {

	public static void main(String[] args) {

		//예제 19-7 FileInputStream의 read() 메서드를 이용한 파일 읽기
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		InputStream in = null;
		try {
			in = new FileInputStream("file_korean.txt");
			while(true) {
				//파일 읽기
				read = in.read();
				//-1이면 종료
				if(read == -1) {
					break;
				}
				System.out.print((char)read);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			
			try {
				//객체가 사용 중이면 닫는다
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
