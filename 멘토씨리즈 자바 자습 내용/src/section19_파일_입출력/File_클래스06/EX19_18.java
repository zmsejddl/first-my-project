package section19_파일_입출력.File_클래스06;

import java.io.File;

public class EX19_18 {

	public static void main(String[] args) {

		//예제 19-18 File 기능
		
		File f = new File("example.txt");
		if(f.exists()) {	//파일이 존재할 경우
			
			System.out.println("length: " + f.length());
			System.out.println("canRead: " + f.canRead());
			System.out.println("canWrite: " + f.canWrite());
			System.out.println("getAbsolutePath: " + f.getAbsolutePath());
			
			System.out.println("getName: " + f.getName());
			System.out.println("getParent: " + f.getParent());
			System.out.println("getPath: " + f.getPath());
			
		} else {	//파일이 존재하지 않을 경우
			System.out.println("파일이 존재하지 않습니다");
		}
		
		/*
		 * 해설
		 * 11: File 클래스 선언 시 생성자 매개변수로 파일 또는 폴더 경로를 받습니다
		 * 12: 파일이 경로에 존재하는지 여부를 반환합니다
		 * 14: 파일의 크기를 반환합니다 (단위는 byte)
		 * 17: 파일의 절대 경로를 반환합니다
		 * 19: 파일의 이름을 반환합니다
		 * 20: 현재 파일 또는 폴더의 상위 폴더를 반환합니다 (없으면 null)
		 * 21: 파일의 상대 경로를 반환합니다
		 */
	}

}
