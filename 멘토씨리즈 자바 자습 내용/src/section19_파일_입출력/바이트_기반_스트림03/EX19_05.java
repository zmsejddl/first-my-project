package section19_파일_입출력.바이트_기반_스트림03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX19_05 {

	public static void main(String[] args) {

		//예제 19-5 read()와 write()를 이용한 이미지 복사
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("back.jpg");
			out = new FileOutputStream("back_copy.jpg");
			//현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while((read = in.read()) != -1) {
				out.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println(time + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 19: 현재 시간을 1/1000초 단위로 나타냅니다
		 * 22~24: 읽은 이미지를 그대로 씁니다
		 * 26: 이미지 복사가 완료된 시점의 시간을 출력합니다
		 * 27: 시간의 차이를 구합니다
		 * 28: 이미지를 복사하는 데 걸린 시간을 출력합니다
		 */
	}

}
