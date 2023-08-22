// 230817

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06_1차바이트스트림 {

	public static void main(String[] args) {

		int w; // 아스키코드 저장 변수
		// FileInputStream과 FileOutputStream는 1차 바이트 스트림
		try {
			FileInputStream fis= new FileInputStream("from.txt"); // 읽기 전용 스트림 생성
			FileOutputStream fos = new FileOutputStream("to.txt"); // 쓰기 전용 스트림 생성, to.txt 파일 자동 생성
			while(true) {
				w = fis.read(); // from.txt에서 읽어서
				if(w == -1) break; // EOF가 들어오면 반복문 탈출
				fos.write((char)w); // to.txt에 쓰기
				System.out.println((char)w); // 콘솔창에도 같이 쓰기(출력)
			}
			fis.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
