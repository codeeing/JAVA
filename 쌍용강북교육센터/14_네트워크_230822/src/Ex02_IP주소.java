import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

// 230822
public class Ex02_IP주소 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InetAddress[] address;
		
		System.out.print("웹사이트 주소 입력:");
		try {
			String url = br.readLine();
			address = InetAddress.getAllByName(url); //getAllByName(): url의 ip주소 리턴
			for(int i=0; i<address.length;++i) {
				System.out.println(address[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
/*
www.daum.net => 192.34.56.78 => DNS(Domain Name Server)가 이렇게 바꿔준다.
*/