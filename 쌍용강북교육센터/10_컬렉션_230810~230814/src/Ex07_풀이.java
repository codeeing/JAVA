import java.util.ArrayList;
import java.util.Scanner;

class Card2{
	private String name;
	private String tel;
	
	// cons.
	public Card2(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	// setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// toString()
	public String toString() {
		return getName()+"\t"+"\t"+getTel();
	}
	
}
public class Ex07_풀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, tel;
		ArrayList<Card2> list = new ArrayList<Card2>();
		int i;
		boolean flag = false;
		
		while(true) {
			flag = false;
			System.out.print("");
			int selectNo = sc.nextInt();
			if(selectNo == 5) break;
			switch(selectNo) {
				case 1: 
					System.out.print("이름을 입력하세요 : ");
					name = sc.next();
					System.out.println("전화번호를 입력하세요 : ");
					tel = sc.next();
					Card2 c = new Card2(name, tel);
					list.add(c);
					break;
				case 2: 
					System.out.print("삭제할 이름을 입력하세요 : ");
					name = sc.next();
					for(i=0;i<list.size();++i) {
						Card2 delete = list.get(i);
						if(delete.getName().equals(name)) {
							list.remove(i);
							System.out.println("삭제되었습니다.");
							flag = true;
							break;
						}
					}
					if(!flag) // flag == false
						System.out.println("이름을 잘못 입력하셨습니다.");
					break;
				case 3: 
					System.out.print("이름을 입력하세요 : ");
					name = sc.next();
					for(i=0;i<list.size();++i) {
						if(list.get(i).getName().equals(name)) {
							System.out.println("수정할 전화번호는 : ");
							tel = sc.next();
							// 방법1
							list.get(i).setTel(tel);
							// 방법2
							//list.set(i, new Card2(name,tel));
							System.out.println("수정되었습니다.");
							flag = true;
							break;
						}
					}
					if(!flag) 
						System.out.println("이름을 잘못 입력하셨습니다.");
					break;
				case 4: 
					System.out.println("이름\t전화번호");
					// 방법1
					for(i=0;i<list.size();++i) {
						System.out.println(list.get(i).getName()+"\t"+list.get(i).getTel());
					}
					// 방법2
					for(Card2 one:list) {
						System.out.println(one);
					}
					System.out.println();
					break;
				default: System.out.println("1~5만 입력 가능");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
/*
1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : kim
전화번호를 입력하세요 : 111

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : park
전화번호를 입력하세요 : 222

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
kim		111
park		222

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : jung
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : park
삭제되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
kim		111

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : hong
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : kim
수정하실 전화번호는 : 777
수정되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
kim		777

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:7
잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
프로그램을 종료합니다.
*/


// 230816 시험: ArrayList, 상속, 예외처리