import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

// 퀴즈맞추는 클라이언트
public class QuizClient {

	public static void main(String[] args) throws IOException {
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		String fromServer;
		String fromUser;
		
		try {
			socket = new Socket("localhost",9191);
			
			out = new PrintWriter(socket.getOutputStream(), true); // socket쪽으로 내보내기위한 스트림 형성
			in = new BufferedReader(
									new InputStreamReader(
											socket.getInputStream()));
		} catch (UnknownHostException e) {
			System.exit(1);
		} catch (IOException e) {
			System.exit(1);
		}
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		while((fromServer = in.readLine()) != null) {
			System.out.println("서버:"+fromServer);
			if(fromServer.equals("quit")) {
				break;
			}
			fromUser = user.readLine();
			System.out.println("클라이언트:"+fromUser);
			out.println(fromUser);
		}
		
		out.close();
		in.close();
		socket.close();
	}

}
