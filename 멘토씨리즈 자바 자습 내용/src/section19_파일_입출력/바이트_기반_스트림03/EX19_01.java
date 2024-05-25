package section19_파일_입출력.바이트_기반_스트림03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EX19_01 {

	public static void main(String[] args) {

		//예제 19-1 read() 메서드를 이용한 파일 읽기
		
		//파일을 읽어올 변수
		int read = 0;
		//스트림 선언
		InputStream in = null;
		try {
			in = new FileInputStream("my_file.txt");
			while(true) {
				//파일 읽기
				read = in.read();
				//-1 이면 종료
				if(read == -1) {
					break;
				}
				System.out.print((char)read);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			
			try {
				//객체가 사용 중이라면 닫는다
				if(in != null) {
					in.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 14: 파일 내용을 저장할 변수를 선언합니다
		 * 16: InputStream 객체를 선언합니다
		 * 17: 입출력 I/O는 try-catch를 의무로 사용합니다
		 * 18: FileInputStream을 선언하면서 파일 경로를 매개변수로 지정합니다
		 * 21: read() 메서드를 사용해 1byte씩 파일을 읽어옵니다
		 * 23~25: 파일을 모두 읽어서 -1을 반환하면 멈춥니다
		 * 26: 바이트 타입으로 읽은 데이터를 문자로 치환합니다
		 * read() 메서드로 파일을 읽을 경우 띄어쓰기나 줄 바꿈 기호까지 읽어 오기 때문에 print() 문을 사용해도 띄어쓰기나 줄 바꿈이 자동으로 일어납니다
		 * 30~38: 입출력 I/O는 사용 후 닫아주는 것이 좋습니다
		 * 다만 finally에서 닫을 경우 다시 try-catch를 한 번 더 작성해야 합니다
		 */
	}

}
