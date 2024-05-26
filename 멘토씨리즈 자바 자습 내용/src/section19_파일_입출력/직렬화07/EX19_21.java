package section19_파일_입출력.직렬화07;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EX19_21 {

	public static void main(String[] args) {

		//예제 19-21 역직렬화
		
		FileInputStream in = null;
		ObjectInputStream ois = null;
		try {
			in = new FileInputStream("object_data.dat");
			ois = new ObjectInputStream(in);
			
			while(in.available() != 0) {
				EX19_19 p = (EX19_19)ois.readObject();
				System.out.println("이름: " + p.getMyName() + ", 나이: " + p.getMyAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(ois != null) {
					ois.close();
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
		 * 13: 객체 역직려로하를 위해 ObjectInputStream을 선언합니다
		 * 18: 파일을 읽을 수 있을 때까지 반복합니다 (0이면 모두 읽은 상태)
		 * 19: 읽어 온 객체를 EX19_19 클래스로 형 변환합니다
		 */
	}

}
