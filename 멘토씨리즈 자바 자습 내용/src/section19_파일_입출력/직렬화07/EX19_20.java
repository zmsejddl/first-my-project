package section19_파일_입출력.직렬화07;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EX19_20 {

	public static void main(String[] args) {

		//예제 19-20 객체 직렬화
		
		EX19_19 p1 = new EX19_19("김철수", 19);
		EX19_19 p2 = new EX19_19("김영희", 17);
		
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			
			out = new FileOutputStream("object_data.dat");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(oos != null) {
					oos.close();
				}
				
				if(out != null) {
					out.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 16: 객체 직렬화를 위해 ObjectOutputStream을 선언합니다
		 * 12~13: 데이터 객체
		 * 19: 파일을 쓰기 위한 FileOutputStream 객체를 선언합니다
		 * 22~23: 객체를 직렬화하여 파일에 작성합니다
		 */
	}

}
