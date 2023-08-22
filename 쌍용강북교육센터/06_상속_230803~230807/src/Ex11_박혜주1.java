import java.util.Scanner;

// 230804
class Person3{
	private String name;//이름
	private int age;//나이
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
class Account extends Person3{
	private String ano; //계좌번호
	private int balance; //잔고
	
	// setter
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setBalance(int plus) {
		this.balance += plus;
	}
	// getter
	public String getAno() {
		return this.ano;
	}
	public int getBalance() {
		return this.balance;
	}
	
	public void show() {
		System.out.println(this.ano+"\t"+this.getName()+"\t"+this.getAge()+"\t"+this.balance);
	}

	
}
public class Ex11_박혜주1 {

	public static void main(String[] args) {
		
		int i;
		int num = 0;
		boolean flag = false;
		Account[] account = new Account[100];
		
		while(true) {
			switch(menu()) {
				case 1:
					num = produce(account, num); break;
				case 2:
					showAcc(account); break;
				case 3:
					deposit(account, num); break;
				case 4:
					withdraw(account, num); break;
				case 5:
					System.out.println("프로그램 종료");
					flag = true; break;
				default:
					System.out.println("메뉴번호를 다시 입력하시오."); break;
			}
			if(flag == true) break;
		}
	}
	
	// 메뉴 띄우기
	static int menu() {
		int menuNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("=======================================");
		System.out.print("선택> ");
		menuNum = sc.nextInt(); // 메뉴번호 입력받기
		
		return menuNum;
	}
	// 계좌 생성하기
	static int produce(Account[] account, int num) {
		Scanner sc = new Scanner(System.in);
		account[num] = new Account(); // account배열의 각 방에 Account객체 생성
		
		System.out.print("계좌번호: ");
		account[num].setAno(sc.next());
		System.out.print("계좌주: ");
		account[num].setName(sc.next());
		System.out.print("나이: ");
		account[num].setAge(sc.nextInt());
		System.out.print("초기입금액: ");		
		account[num].setBalance(sc.nextInt());
		System.out.println("결과 : 계좌가 생성되었습니다.");
		System.out.println();
		return ++num; // 배열의 방번호 하나 증가
	}
	// 계좌목록 띄우기
	static void showAcc(Account[] account) {
		int i;
		
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(i=0; i<account.length; ++i) { // 100번 돌기
			if(account[i]==null) break;
			account[i].show();
		}
		System.out.println();
	}
	// 예금하기
	static void deposit(Account[] account, int num) {
		int i;
		int plus;
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌번호: ");
		String ano = sc.next(); // 찾을 계좌 입력받기
		System.out.print("예금액: ");
		plus = sc.nextInt(); // 예금액 입력받기
		
		// 입력받은 계좌번호가 있는 객체를 찾고,
		for(i=0; i<=num-1; ++i) {
			// 찾았다면 예금 및 성공메시지 출력
			if(account[i].getAno().equals(ano) == true) {
				account[i].setBalance(plus);
				System.out.println("결과: 예금이 성공되었습니다.");
				System.out.println();
				break;
			}
		}
		// 못찾았다면 없다고 출력
		if(account[i] == null) {
			System.out.println("예금할 계좌가 없습니다.");
			System.out.println();
		}
	}
	
	// 출금하기
	static void withdraw(Account[] account, int num) {
		int i;
		int minus;
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌번호: ");
		String ano = sc.next(); // 찾을 계좌 입력받기
		System.out.print("출금액: ");
		minus = sc.nextInt(); // 출금액 입력받기
		
		// 입력받은 계좌번호가 있는 객체를 찾고,
		for(i=0; i<=num-1; ++i) {
			// 찾았다면 출금하기
			if(account[i].getAno().equals(ano) == true) {
				if(minus > account[i].getBalance()) {
					System.out.println("예금액 이상은 출금 불가");
					System.out.println();
					break;
				}
				account[i].setBalance(-minus);
				System.out.println("결과: 출금이 성공되었습니다.");
				System.out.println();
				break;
			}
		}
		// 못찾았다면 없다고 출력
		if(account[i] == null) {
			System.out.println("출금할 계좌가 없습니다.");
			System.out.println();
		}
	}
}