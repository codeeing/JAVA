import java.io.FileOutputStream;

public class Ex05_FileOutputStream {

	public static void main(String[] args) {
		
		try {
			// 내보내기위한 연결다리 형성, 자동으로 a.txt 생성됨
			FileOutputStream fos = new FileOutputStream("a.txt",false); // new FileNotFoundException(), 없는 폴더를 경로에 넣었을때 발생
			/*
			 * false: 파일 없으면 생성, 있으면 싹다 지우고 새로 만듬
			 * true: 파일 없으면 생성, 있으면 안 지우고 그 밑에 출력
			 */
			fos.write(97); // new IOException()
			fos.write('b'); // 98
			fos.close();
		} catch (Exception e) { // 업캐스팅
			e.printStackTrace();
		}
	}

}
