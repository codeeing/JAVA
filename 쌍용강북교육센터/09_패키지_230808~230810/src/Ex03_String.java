import java.util.Scanner;

// 230809
public class Ex03_String {

	public static void main(String[] args) {
		String s1 = "    abc De     Fg  ";
		String result;
		
		System.out.println(s1);
		System.out.println(s1.length()); // 19
		System.out.println(s1.trim());
		System.out.println(s1.trim().length()); // 13, 앞뒤 공백을 없앰
		
		String id = "kim  "; // 가입한 id
		String pw = "1234"; // 가입한 pw
		
		id = id.trim();
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디를 입력하시오> ");
//		String userId = sc.next();
//		System.out.print("패스워드를 입력하시오> ");
//		String userPw = sc.next();
//		if(id.equals(userId.trim()) && pw.equals(userPw.trim())) {
//			System.out.println("로그인 가능합니다.");
//		}else {
//			System.out.println("로그인 불가능합니다.");
//		}
		
		System.out.println("s1.toUpperCase(): "+s1.toUpperCase()); // 모두 대문자로 바꾸어 출력
		System.out.println("s1.toLowerCase(): "+s1.toLowerCase()); // 모두 소문자로 바꾸어 출력
		System.out.println("s1.contains(\"g\"): "+s1.contains("g")); // 전달인자 포함하고 있으면 true, 없으면 false
		
	}

}
