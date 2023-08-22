// 230809
import java.util.Scanner;

class Person{
	String id;
	String pw;
	String name;
	
	// cons.
	public Person(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
public class Ex05_박혜주 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int i;
		boolean flag = false;
		String id, pw, ans;
		Person[] pp = {
							new Person("kim","1234","김연아"), 
							new Person("son","7777","손흥민"), 
							new Person("jang","9876","장미란")
						};
		
		while(true) {
			System.out.print("id입력: ");
			id = sc.next();
			if(id.length()<3 || id.length()>8) {
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;
			}
			// 입력받은 id 찾기
			for(i=0;i<pp.length;++i) {
				// id를 찾았으면
				if(id.equals(pp[i].id)) {
					System.out.print("pw입력: ");
					pw = sc.next();
					// 입력받은 pw 찾기
					if(pw.equals(pp[i].pw)) {
						System.out.println(pp[i].name+"님 반갑습니다.");
					}
					// pw를 못찾았으면
					else {
						System.out.println("비번이 맞지 않습니다.");
					}
					// 계속할지 말지?
					System.out.print("계속? ");
					ans = sc.next();
					if(ans.equals("y")) {
						break;
					}else {
						flag = true;
						System.out.println("프로그램을 종료합니다.");
						break;
					}	
				}
			}
			// id를 못찾았으면
			if(i==pp.length) {
				System.out.println("일치하는 id가 없습니다.");
				continue;
			}
			if(flag) break;
		}

	}
}
/*
id입력:qw
id는 3글자~8글자 입력해야 합니다.
id입력:klsdjlsfjsldf
id는 3글자~8글자 입력해야 합니다.
id입력:park
일치하는 id가 없습니다.
id입력:son
pw입력:1234
비번이 맞지 않습니다.
계속?y
id입력:son
pw입력:7777
손흥민님 반갑습니다.
계속?y
id입력:kim
pw입력:1234
김연아님 반갑습니다.
계속?n
프로그램을 종료합니다.

*/

