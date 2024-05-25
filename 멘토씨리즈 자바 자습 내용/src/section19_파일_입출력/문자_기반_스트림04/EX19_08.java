package section19_파일_입출력.문자_기반_스트림04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class EX19_08 {

	public static void main(String[] args) {

		//예제 19-8 FileReader의 read() 메서드를 이용한 파일 읽기
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		Reader reader = null;
		
		try {
			reader = new FileReader("file_korean.txt");
			while(true) {
				//파일 읽기
				read = reader.read();
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
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 14: 파일 내용을 저장할 변수를 선언합니다
		 * 16: Reader 객체를 선언합니다
		 * 18: 입출력 I/O는 try-catch를 의무적으로 사용합니다
		 * 19: FileReader을 선언하면서 파일 경로를 매개변수로 지정합니다
		 * 22: read() 메서드를 사용하여 1byte씩 파일을 읽어옵니다
		 * 24~26: 파일을 모두 읽어서 -1을 반환하면 멈춥니다
		 */
	}

}
