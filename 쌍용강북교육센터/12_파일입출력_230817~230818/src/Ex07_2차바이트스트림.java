import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 230817
// Buffer: 스트림으로부터의 입출력 속도 향상을 위한 메모리의 임시 저장소
public class Ex07_2차바이트스트림 {

	public static void main(String[] args) {
		int i;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		try {
			FileOutputStream fos = new FileOutputStream("data.txt"); // 1차 스트림
			// 버퍼의 도움을 받아 내보내겠다.
			bos = new BufferedOutputStream(fos, 5); // 2차 스트림, 아무것도 안쓰면 버퍼의 사이즈 8192가 자동으로 들어옴.
			// 6번째 데이터가 버퍼에 들어오려고 하면 내보내기 시전
			for (i = 1; i < 9; ++i) {
				bos.write(i + 48); // a:97 A:65 0:48 ..
				// 버퍼에 쓰는것. 버퍼사이즈는 5이기때문에, 1~5는 data.txt로 내보내지만,
				// 6~8은 여전히 버퍼안에 남아있음
			}
			// 버퍼에 남아있는 나머지 찌꺼기 6,7,8을 모두 내보내기
			bos.flush();
			FileInputStream fis = new FileInputStream("data.txt");
			// 버퍼의 도움을 받아 읽어오겠다.
			bis = new BufferedInputStream(fis, 5);
			while ((i = bis.read()) != -1) {
				System.out.println((char) i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// 2차 스트림을 닫으면 1차 스트림도 자동으로 닫힌다.
				// bos가 닫힐때, bos 버퍼에 남아있던 6,7,8 데이터가
				// 이제서야 data.txt에 내보내기를 진행한다.
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
