import java.util.Scanner;

// 230810

public class Ex10_박혜주_ver2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] lotto = new int[6]; // 발생한 난수를 저장하는 배열.
		int[] my = new int[6]; // 내가 입력한 숫자를 저장하는 배열.
		// 중복 체크 배열. 뽑힌 숫자라면 true 저장.
		boolean[] lottoChk = new boolean[46];
		boolean[] myChk = new boolean[46];

		lotto(lotto, lottoChk); // 로또추첨
		my(my, myChk); // 입력받기
		choose(lotto, my); 	// 당첨여부출력
		
	}
	// 로또추첨
	private static void lotto(int[] lotto, boolean[] lottoChk) {
		int i;
		
		for (i = 0; i < lotto.length; ++i) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 1 ~ 45
			if (lottoChk[lotto[i]]) // 중복된 숫자라면
				--i;
			else // 새로운 숫자라면 체크 배열 true로 초기화
				lottoChk[lotto[i]] = true;
		}
	}
	// 입력받기
	private static void my(int[] my, boolean[] myChk) {
		int i;
		
		for (i = 0; i < my.length; ++i) {
			System.out.print("숫자" + (i + 1) + ": ");
			my[i] = sc.nextInt();
			if (my[i] < 1 || my[i] > 45) {
				System.out.println("1~45 사이의 수를 입력하세요.");
				--i;
				continue;
			}
			if (myChk[my[i]]) { // 중복된 숫자라면
				System.out.println("중복됨");
				--i;
			}else { // 새로운 숫자라면 체크 배열 true로 초기화
				myChk[my[i]] = true; 
			}
		}

	}
	// 당첨여부출력
	private static void choose(int[] lotto, int[] my) {
		int i,j;
		int cnt = 0;
		
		System.out.println("컴이 발생시킨 로또 번호");
		for (i = 0; i < lotto.length; ++i) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("내가 선택한 로또 번호");
		for (i = 0; i < my.length; ++i) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println();
		for (i = 0; i < lotto.length; ++i) {
			for (j = 0; j < my.length; ++j) {
				if (lotto[i] == my[j])
					++cnt;
			}
		}
		
		System.out.println("맞은 개수 : " + cnt);
		switch (cnt) {
		case 6:
			System.out.println("1등입니다!");
			break;
		case 5:
			System.out.println("2등입니다!");
			break;
		case 4:
			System.out.println("3등입니다!");
			break;
		default:
			System.out.println("꽝!!");
			break;

		}
	}
}