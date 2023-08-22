import java.util.Scanner;

// 230811

public class Ex10_풀이 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int[] my = new int[6];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int i,j;
		
		for(i=0;i<lotto.length;++i) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(j=0;j<i;++j) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			
		}
		
		for(i=0;i<my.length;++i) {
			System.out.print("숫자: "+(i+1)+":");
			my[i] = sc.nextInt();
			if(my[i] < 1 || my[i] > 45) {
				System.out.println("1~45사이의 수를 입력하세요.");
				i--;
				continue;
			}
			for(j=0;j<i;++j) {
				if(my[i] == my[j]) {
					System.out.println("중복됨");
					j = -1;
					--i;
					break;
				}
			}
		}
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<lotto.length;++i) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("내가 입력한 로또 번호");
		for(i=0;i<my.length;++i) {
			System.out.print(my[i]+" ");
		}
		
		for(i=0;i<lotto.length;++i) {
			for(j=0;j<my.length;++j) {
				if(lotto[i] == my[j]) {
					++count;
				}
			}
		}
		System.out.println();
		System.out.println("맞은 개수:"+count);
		switch(count) {
			case 6: System.out.println("1등"); break;
			case 5: System.out.println("2등"); break;
			case 4: System.out.println("3등"); break;
			default: System.out.println("꽝");
		}
	}
}
