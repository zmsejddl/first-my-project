package section19_파일_입출력.보조_스트림05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX19_13 {

	public static void main(String[] args) {

		//예제 19-13 보조 스트림을 이용한 이미지 복사
		
		FileInputStream readFile = null;	//기반 스트림
		BufferedInputStream bis = null;		//보조 스트림
		
		FileOutputStream writeFile = null;	//기반 스트림
		BufferedOutputStream bos = null;	//보조 스트림
		
		try {
			System.out.println("기본 스트림으로 복사 시작");
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			//데이터 읽을 변수
			int read = 0;
			
			//현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작1");
			while ((read = readFile.read()) != -1) {
				//이미지 쓰기
				writeFile.write(read);
			}
			System.out.println("이미지 복사 종료1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			
			System.out.println("소요 시간: " + time + "초");
			System.out.println("기본 스트림으로 복사 종료");
			
			//파일 닫기
			readFile.close();
			writeFile.close();
			
			System.out.println("보조 스트림으로 복사 시작");
			
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(writeFile);
			//현재 시간을 m/s 단위로 나타냄
			start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작2");
			while(bis.read() != -1) {
				//이미지 쓰기
				bos.write(read);
			}
			
			System.out.println("이미지 복사 종료2");
			end = System.currentTimeMillis();
			double result = (double)(end - start) / 1000;
			
			System.out.println("소요 시간: " + result + "초");
			System.out.println("보조 스트림으로 복사 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(readFile != null) {
					readFile.close();
				}
				
				if(bos != null) {
					bos.close();
				}
				if(writeFile != null) {
					writeFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * 해설
		 * 15: FileInputStream 객체를 선언합니다
		 * 16: BufferedInputStream을 선언합니다
		 * 18: FileOutputStream 객체를 선언합니다
		 * 19: BufferedOutputStream 객체를 선언합니다
		 * 24: FileOutputStream 객체 선언 시 이미지를 복사할 경로를 지정합니다
		 * 34: 이미지를 복사합니다
		 * 43~44: 객체를 재정의하기 위해서 기존에 사용한 I/O을 닫습니다
		 */
	}

}
