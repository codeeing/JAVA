import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 230818
public class Ex10_풀이 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		BufferedReader br = null;
		BufferedWriter out = null;
		String str, line, find;
		boolean flag;
		
		while (true) {
			System.out.println("1.단어입력 2.단어검색 3.종료");
			System.out.println(">>");
			Scanner sc = new Scanner(System.in);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				System.out.print("단어/뜻 입력>>");
				in = new BufferedReader(new InputStreamReader(System.in));
				str = in.readLine();
				out = new BufferedWriter(new FileWriter("c:\\sun\\voca.txt",true));
				out.write(str);
				// out.writ("\n");
				out.newLine(); // 엔터치는 메서드
				out.flush();
				out.close();
				break;
			case 2:
				flag = false;
				System.out.print("검색 단어 입력>>");
				in = new BufferedReader(new InputStreamReader(System.in));
				find = in.readLine(); // blue sky
				br = new BufferedReader(new FileReader("c:\\sun\\voca.txt"));
				while((line = br.readLine()) != null) {
					String[] parts = line.split("/");
					if(find.equals(parts[0])) {
						flag = true;
						System.out.println("단어>" + parts[0]);
						System.out.println("단어의 뜻>" + parts[1]);
						break;
					}
				}
				if(flag == false) {
					System.out.println("찾는 단어 없음");
				}
				br.close();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("1~3의 숫자만 입력 가능");
			}

		}
	}

}
