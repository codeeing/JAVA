import java.util.Scanner;

// 230727
public class Ex04_switch_case {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		num = sc.nextInt();
		
		switch(num+1) { // 제어문
		case 1: System.out.println("1입니다."); break;
		case 2: System.out.println("2입니다."); break;
		case 3: System.out.println("3입니다."); break;
		default: System.out.println("1~3이 아닙니다.");
		}
		System.out.println("switch~case 공부중");
		System.out.println("과일명 입력: ");
		String fruit = sc.next();
		switch(fruit) {
		case "apple": System.out.println("사과"); break;
		case "grape": System.out.println("포도"); break;
		case "peach": System.out.println("복숭아"); break;
		default: System.out.println("그 밖의 과일");
		}
		
		sc.close();
	}

}
