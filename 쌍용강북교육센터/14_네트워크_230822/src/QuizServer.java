import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 퀴즈내는 서버
public class QuizServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		String fromClient;
		
		try {
			serverSocket = new ServerSocket(9191);
		} catch (IOException e) {
			System.out.println("사용할 수 없는 포트번호 입니다.");
			System.exit(1);
		}
		System.out.println("Server ready..."); // 어떤 클라이언트가 접속해 올때까지 마냥 기다리는 중...
		try {
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트 접속됨");
		} catch (IOException e) {
			System.out.println("accept 실패");
			System.exit(1);
		}
		
		// PrintWriter도 buffer기능이 있다.
		// true: 버퍼를 다 채우지 않았어도 그냥 내보내라. 자동 flush() 기능!
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // clientSocket쪽으로 내보내기위한 스트림 형성
		BufferedReader in = new BufferedReader(
								new InputStreamReader(
										clientSocket.getInputStream()));
		
		QuizBank bank = new QuizBank();
		String bankLine = bank.process(null);
		out.println(bankLine);
		
		while((fromClient = in.readLine()) != null) {
			bankLine = bank.process(fromClient);
			out.println(bankLine);
		}
		
		out.close();
		in.close();
		serverSocket.close();
		clientSocket.close();
	}

}
