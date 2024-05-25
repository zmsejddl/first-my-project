package section19_파일_입출력.바이트_기반_스트림03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EX19_02 {

	public static void main(String[] args) {

		//예제 19-2 Read(byte[]) 메서드를 이용한 파일 읽기
		
		//파일을 읽어올 변수
		int read = 0;
		
		//스트림 선언
		InputStream in = null;
		
		//데이터를 담을 배열 선언
		byte[] buffer = new byte[5];
		try {
			in = new FileInputStream("my_file.txt");
			while(true) {
				//파일 읽기
				//읽어온 데이터는 배열에 담긴다
				read = in.read(buffer);
				//-1이면 종료
				if(read == -1) {
					break;
				}
				System.out.print(new String(buffer, 0, read));
			}
		} catch(IOException e) {
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
		
		/*
		 * 해설
		 * 20: 데이터를 저장할 바이트 배열을 선언합니다
		 * 26: read() 메서드 호출 시 배열을 매개변수로 전달합니다
		 * 해당 배열의 크기만큼 데이터를 읽어서 저장하고 그 크기를 반환합니다
		 * 31: String 객체 생성자에 배열 이름과 시작 위치, 길이를 매개변수로 전달하여 데이터를 읽은 길이만큼 배열에서 꺼내어 문자열로 반환합니다
		 */
	}

}
