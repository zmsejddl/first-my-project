package section19_파일_입출력.보조_스트림05;

import java.io.BufferedReader;
import java.io.FileReader;

public class EX19_14 {

	public static void main(String[] args) {

		//예제 19-14 BufferedReader
		
		FileReader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader("book.txt");
			br = new BufferedReader(reader);
			//문장을 저장할 변수
			String str = "";
			//버퍼에 문자를 저장하기 때문에 한번에 읽기 가능
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(br != null) {
					br.close();
				}
				
				if(reader != null) {
					reader.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 12: FileReader 객체를 선언합니다
		 * 13: BufferedReader를 선언합니다
		 * 21: BufferedReader는 버퍼에 단어를 저장하여 한 번에 출력하기 때문에 문장으로 읽어 들이고 반환할 수 있습니다
		 */
	}

}
