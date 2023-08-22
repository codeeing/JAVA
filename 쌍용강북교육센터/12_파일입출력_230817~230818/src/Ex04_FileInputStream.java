import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 230817

public class Ex04_FileInputStream {

	public static void main(String[] args) {
		File dir = new File("c:\\sun");
		File f = new File(dir, "abc.txt");

		try {
			// 파일에서 뭔가를 읽어오려면 이클립스와 파일간의 연결다리 형성이 필요한데,
			// 이러한 연결다리를 스트림이라고 한다.
			// FileInputStream 객체를 만들면 읽어오기만을 위한 다리가 형성이된다.
			// 쓰기위한 다리는 FileOutputStream 객체를 만들어야한다.
			
			// 읽어들일때는 읽어들이기 위한 파일이 반드시 미리 구비되어있어야함.
			FileInputStream fis = new FileInputStream(f); // 바이트스트림은 한글을 읽어올 수 없음. 문자스트림으로 읽어올 수 있다.
			// FileInputStream fis = new FileInputStream("c:\\sun\\abc.txt");

			while (true) {
				int str = fis.read(); // fis연결다리를 타고 앞글자 하나 읽어와라. 문자의 아스키코드 값을 리턴함.
				if (str == -1) // EOF(End Of File, 파일이 끝나는 어떤 상태)가 들어오면 -1을 리턴. 이때 -1은 아스키코드가 아님.
					break;
				System.out.println((char)str);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
/*
104 => h
101 => e
108 => l
108 => l
111 => o
13 => 엔터의 맨 앞으로가기
10 => 바로 다음줄로 내려가기
*/ 