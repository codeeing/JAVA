import java.util.InputMismatchException;
import java.util.Scanner;

// 230808
public class Ex05_random {

	public static void main(String[] args) {
//		Math 클래스의 모든 메서드는 static 메서드. 따라서 클래스 이름으로 접근.
		int rm = (int)(Math.random()*100)+1; // 1 <= rm <= 100
		int count = 0;
		// System.out.println("rm: "+rm); // (int)0*100 <= (int)rm*100 < (int)1*100
		// 3 ~ 300
		// 1. 300 - 3 = 297
		// 2. 297+1 = 298
		// (Math.random()*298)+3
		// 시작하는 숫자를 + 뒤에쓰고,
		// 뒤에서 앞에꺼 뺀다음 + 1을 한다. 그걸 * 뒤에 쓴다.
		
		do {
			++count;
			int input;
			System.out.print("1~100사이의 정수값을 입력 : ");
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt(); // java.util.InputMismatchException
			}catch(InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다. 다시 입력하세요");
				continue;
			}
			
			if(rm > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(rm < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도한 횟수는 "+count+"번 입니다.");
				break;
			}
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}

}
