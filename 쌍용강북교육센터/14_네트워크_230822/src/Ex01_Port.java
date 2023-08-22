// 230822
import java.io.IOException;
import java.net.ServerSocket;

// 서버쪽: ServerSocket 클래스, 클라이언트쪽: Socket 클래스
public class Ex01_Port {

	public static void main(String[] args){
		ServerSocket ss = null;
		for(int i=0; i<65535; ++i) {
			try {
				ss = new ServerSocket(i); // 서버쪽 ServerSocket 장치의 i번 포트번호를 통해서 통신하겠다.
				ss.close();
			} catch (IOException e) { // 이미 사용중인 포트번호를 사용하려고 할 때 발생
				//e.printStackTrace();
				System.out.println(i+"번 포트번호는 이미 사용중입니다.");
			}
		}
	}

}
