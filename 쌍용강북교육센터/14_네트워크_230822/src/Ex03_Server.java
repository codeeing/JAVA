import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 230822
public class Ex03_Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null; // 서버측 ServerSocket 장치 만들기
		Socket clientSocket = null;
		
		try {
			// ServerSocket(포트번호)
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.out.println("5555 포트번호에 연결할 수 없습니다.");
			System.exit(1); // 비정상 종료이므로 괄호안에 1 기입
		}
		
		System.out.println("Server ready...");
		try {
			clientSocket = serverSocket.accept(); // 서버쪽으로 접속을 시도한 클라이언트 받아들이기
		} catch (IOException e) {
			
		}
		
		// 클라이언트 정보가 clientSocket에 저장됨.
		// 서버에서 클라이언트 쪽을 내보내기위한 연결다리를 만들어야함.
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
		// 클라이언트가 보내오는 데이터를 읽어오기 위한 연결다리를 형성
		BufferedReader in = new BufferedReader(
								new InputStreamReader(
										clientSocket.getInputStream()));
		String inputLine = in.readLine();
		System.out.println("클라이언트가 보내온 데이터 : "+inputLine);
		
		out.close();
		in.close();
		serverSocket.close();
		clientSocket.close();
	}

}
/*
C:\Java_phj\14_네트워크_230822~\src>javac Ex03_Server.java -encoding UTF-8

C:\Java_phj\14_네트워크_230822~\src>java Ex03_Server
Server ready...
클라이언트가 보내온 데이터 : 안녕하세요
*/