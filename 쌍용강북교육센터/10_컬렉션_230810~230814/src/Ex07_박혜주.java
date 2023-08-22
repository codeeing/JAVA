import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	
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
public class Ex07_박혜주 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean flag = false;
	
	public static void main(String[] args) {
		ArrayList<Card> cArr = new ArrayList<Card>();
		
		while(true) {
			switch(menu()) {
				case 1: create(cArr); break;
				case 2: delete(cArr); break;
				case 3: update(cArr); break;
				case 4: show(cArr); break;
				case 5: quit(); break;
				default: System.out.println("잘못입력하셨습니다."+"\n");
			}
			if(flag) break;
		}
	}
	
	// 메뉴
	public static int menu() {
		int menuNum;
		
		while(true) {
			try {
				System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
				menuNum = sc.nextInt();	
				return menuNum;
			}catch(Exception e) {
				System.out.println("잘못입력하셨습니다.");
				System.out.println();
				sc.nextLine();
				continue;
			}
		}
	}
	// 명함추가
	public static void create(ArrayList<Card> cArr) {
		Card c = new Card();
		
		System.out.print("이름을 입력하세요: ");
		c.setName(sc.next());
		System.out.print("전화번호를 입력하세요: ");
		c.setTel(sc.next());
		cArr.add(c);
		System.out.println();
	}
	// 명함삭제
	public static void delete(ArrayList<Card> cArr) {
		boolean flag = false;
		String name;
		Iterator<Card> iter = cArr.iterator();
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		while(iter.hasNext()) {
			Card c = iter.next();
			if(c.getName().equals(name)) {
				cArr.remove(c);
				System.out.println("삭제되었습니다.");
				System.out.println();
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("이름을 잘못 입력하셨습니다.");
			System.out.println();
		}
	}
	// 명함수정
	public static void update(ArrayList<Card> cArr) {
		boolean flag = false;
		String name, tel;
		Iterator<Card> iter = cArr.iterator();
		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		while(iter.hasNext()) {
			Card c = iter.next();
			if(c.getName().equals(name)) {
				System.out.print("수정하실 전화번호는: ");
				tel = sc.next();
				c.setTel(tel);
				System.out.println("수정되었습니다.");
				System.out.println();
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("이름을 잘못 입력하셨습니다.");
			System.out.println();
		}
	}
	// 명함보기
	public static void show(ArrayList<Card> cArr) {
		System.out.println("이름"+"\t"+"\t"+"전화번호");
		for(Card i:cArr) {
			System.out.println(i);
		}
		System.out.println();
	}
	// 종료
	private static void quit() {
		System.out.println("프로그램을 종료합니다.");
		flag = true;
	}
}
