import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 230817
public class Ex09_InputStreamReader {

	// System.in: 키보드를 의미
	// InpuStream: 표준입력스트림, 키보드와 자바간의 연결다리를 생성
	public static void main(String[] args) {
		System.out.println("입력: ");
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
		
		// InputStream: 1차바이트스트림. 따라서 한글 입력 못받음.
		InputStream is = System.in;
		// InputStreamReader: 바이트스트림을 문자스트림으로 바꿈.
		InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader: 버퍼의 이용으로 더 빨리 읽어오겠다.
		BufferedReader br = new BufferedReader(isr);
		// 이렇게 한 줄로 써도 된다.
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// readLine(): 한 줄 읽어오는 메서드. 엔터치기 전까지의 데이터를 모두 읽기 가능. 공백도 읽기 가능.
			String str = br.readLine(); 
			System.out.println(str);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
