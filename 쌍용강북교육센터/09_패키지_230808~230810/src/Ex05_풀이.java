// 230810
import java.util.Scanner;

class Person2{
	private String id;
	private String pw;
	private String name;
	
	// cons.
	public Person2(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Ex05_풀이 {

	public static void main(String[] args) {
		Person2[] pp = {
							new Person2("kim","1234","김연아"), 
							new Person2("son","7777","손흥민"), 
							new Person2("jang","9876","장미란")
						};
		Scanner sc = new Scanner(System.in);
		String retry, id, pw;
		boolean flag = false; 
		int i;
		do {
			flag = false;
			System.out.print("id입력: ");
			id = sc.next();
			if(id.length()<3 || id.length()>8) {
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue; // 반복문의 조건식으로 이동
			}else { // 3글자에서 8글자 사이라면
				for(i=0;i<pp.length;++i) {
					if(pp[i].getId().equals(id)){
						flag = true;
					}
				}
				if(flag == false) {
					System.out.println("일치하는 id가 없습니다.");
					continue;
				}
			}
			System.out.print("pw입력: ");
			pw = sc.next();
			for(i=0;i<pp.length;++i) {
				if(pp[i].getId().equals(id)) {
					if(pp[i].getPw().equals(pw)) {
						System.out.println(pp[i].getName()+"님 반갑습니다.");
						break; // 빠져나간다.
					}else {
						System.out.println("비번이 맞지 않습니다.");
					}
				}
			}
			System.out.println("계속?");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}

}
