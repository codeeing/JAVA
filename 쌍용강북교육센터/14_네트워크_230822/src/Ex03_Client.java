import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 230822
public class Ex03_Client {

	public static void main(String[] args) throws IOException {
		Socket socket = null; // 클라이언트측 Socket 장치 만들기
		PrintWriter out = null;
		try {
			// Socket("IP주소", 포트번호)
			socket = new Socket("192.168.0.221",5555);// localhost: 내 컴퓨터를 의미
			// 클라이언트가 접속을 시도하려고 한 서버쪽으로 데이터를 내보내기 위한 다리를 형성
			out = new PrintWriter(socket.getOutputStream());
		} catch (UnknownHostException e) {
			System.out.println("없는 서버입니다");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("이미 사용중인 포트번호입니다.");
			System.exit(1);
		} 
		
		// 키보드로부터 한글입력 받기위한 user 다리
		BufferedReader user = new BufferedReader(
								new InputStreamReader(System.in));
		System.out.print("문자 입력: ");
		String fromUser = user.readLine();
		System.out.println("클라이언트 입력: "+fromUser);
		out.println(fromUser);
		
		out.close();
		user.close();
		socket.close();
	}

}
/*
C:\Java_phj\14_네트워크_230822~\src>javac Ex03_Client.java -encoding UTF-8

C:\Java_phj\14_네트워크_230822~\src>java Ex03_Client -encoding UTF-8
문자 입력: 안녕하세요
클라이언트 입력: 안녕하세요
*/