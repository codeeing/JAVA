import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex10_박혜주 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean flag;

	public static void main(String[] args) {
		
		while (true) {
			switch (menu()) {
			case 1:
				input(); break;
			case 2:
				search(); break;
			case 3:
				flag = true; break;
			default:
				System.out.println("1~3번 사이로 입력");
			}
			if (flag)
				break;
		}
		System.out.println("프로그램을 종료합니다.");
	}

	// 메뉴출력
	public static int menu() {
		int menuNum;
		
		System.out.println("1.단어입력 2.단어검색 3.종료");
		System.out.print(">>");
		menuNum = sc.nextInt();

		return menuNum;
	}

	// 단어입력
	public static void input() {

		BufferedWriter bw = null;
		BufferedReader br = null;
		String word;
		
		try {
			bw = new BufferedWriter(new FileWriter("voca1.txt", true));
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("단어/뜻 입력>>");
			word = br.readLine();
			bw.write(word + "\n");
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				//br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 단어검색
	public static void search() {

		BufferedReader br1 = null, br2 = null;
		String find; // 검색할 단어를 저장하는 변수
		String voca; // voca1.txt에서 읽어온 한줄을 저장하는 변수
		String[] word; // split된 문자열을 관리하는 word 변수
		boolean flag;
		
		try {
			flag = false;
			System.out.print("검색 단어 입력>>");
			br1 = new BufferedReader(new InputStreamReader(System.in));
			br2 = new BufferedReader(new FileReader("voca1.txt"));
			
			find = br1.readLine().toLowerCase(); // hand
			// voca1.txt 파일로부터 한줄씩 읽기
			do {
				voca = br2.readLine(); // apple/사과
				if(voca == null) break; 
				word = voca.split("/"); // word[0] = "apple", word[1] = "사과"
				if (word[0].equals(find) || word[1].equals(find)) {
					System.out.println("단어>" + word[0]);
					System.out.println("단어의 뜻>" + word[1] + "\n");
					flag = true;
					break;
				}
			}while(true);
			
			if(!flag)
				System.out.println("찾는 단어 없음\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//br1.close();
				br2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
