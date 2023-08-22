// 230814
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex11_HashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dic = new HashMap<String, String>();
		String find;
		
		dic.put("pencil", "연필");
		dic.put("sky", "하늘");
		dic.put("desk", "책상");
		dic.put("face", "얼굴");
		
		while(true) {
			System.out.print("찾는 단어는?(q입력시 종료) ");
			find = sc.next().toLowerCase();
			if(find.equals("q")) break;
			if(dic.containsKey(find))
				System.out.print("뜻 : "+dic.get(find));
			else
				System.out.println("잘못입력하셨음");
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
