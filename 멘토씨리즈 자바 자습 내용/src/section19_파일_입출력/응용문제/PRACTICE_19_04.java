package section19_파일_입출력.응용문제;

import java.io.FileInputStream;

public class PRACTICE_19_04 {

	public static void main(String[] args) {

		FileInputStream in = null;
		try {
			in = new FileInputStream("read.txt");
			int read = 0;
			
			while((in.read()) != -1) {
				read = in.read();
				System.out.println((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
