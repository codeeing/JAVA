// 230808
import java.util.InputMismatchException;
import java.util.Scanner;

class Person4{
	private String name;
	private int age;
	
	Person4(String name, int age){
		this.name = name;
		this.age = age;
	}
	
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
		
	public String toString() { // toString은 반드시 public을 붙여야 한다.
		return name+"\t"+age;
	}
}
class Account2 extends Person4{
	private String ano;
	private int balance;
	
	Account2(String name, int age, String ano, int balance){
		super(name, age);
		this.ano = ano;
		this.balance = balance;
	}
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
	
	public String toString() { // 메서드 오버라이딩
		return super.toString()+"\t"+ano+"\t"+balance;
	}
}

public class Ex11_박혜주_풀이및과제 {
	
	static Scanner sc = new Scanner (System.in);
	static Account2[] accArr = new Account2[100];
	static int AccountNum;

	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("=======================================");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
	
			}else if(selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 강제로 프로그램을 종료하기, 0은 정상종료, 1은 뭔가 문제가 있어서 강제종료
			}else {
				
			}
			
		}
	}
	public static void createAccount(){
		
		String ano;
		String name;
		int age;
		int balance;
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("계좌주: ");
		name = sc.next();
	
		while(true) {
			try {
				// Scanner sc = new Scanner(System.in); 스캐너 변수 새롭게 선언하거나,
				System.out.print("나이: ");
				age = sc.nextInt();  // 입력을 받지 않는 문제 발생
				break;
			}catch(Exception e) {
				System.out.println("나이는 숫자로 입력하세요");
				sc.nextLine(); // 입력 버퍼를 비운다.
			}
		}
	
		System.out.print("초기입금액: ");
		balance = sc.nextInt();
		Account2 acc = new Account2(name, age, ano, balance);
		accArr[AccountNum++] = acc;
		System.out.println("결과 : 계좌가 생성되었습니다.");
		System.out.println();
	}
	public static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		int i;
		if(accArr[0] != null) {
			System.out.println("계좌번호\t계좌주\t나이\t초기입금액");
			
		}
		for(i=0; i<accArr.length;++i) {
			if(accArr[i] != null)
				System.out.println(accArr[i].getAno()+"\t"+accArr[i].getName()+"\t"+accArr[i].getAge()+"\t"+accArr[i].getBalance());
		}
	}
	public static void deposit() {
		String ano;
		int balance;
		boolean flag = false;
		int i;
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("예금액: ");
		balance = sc.nextInt();
		
		for(i=0; i<AccountNum; ++i) {
			if(accArr[i].getAno().equals(ano) == true) {
				accArr[i].setBalance(accArr[i].getBalance() + balance);
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("없는 계좌입니다.");
	}
	public static void withdraw() {
		String ano;
		int balance;
		boolean flag = false;
		int i;
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("출금액: ");
		balance = sc.nextInt();
		
		System.out.print("계좌번호: ");
		ano = sc.next();
		System.out.print("예금액: ");
		balance = sc.nextInt();
		
		for(i=0; i<AccountNum; ++i) {
			if(accArr[i].getAno().equals(ano) == true) {
				accArr[i].setBalance(accArr[i].getBalance() - balance);
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("없는 계좌입니다.");
	}

}
// 자동 임포트 키: ctrl + shift + O