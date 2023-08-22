// 230731
public class Ex12_break_continue {

	public static void main(String[] args) {
		
		int i,j;
		for(i=2;i<=9;++i) {
			if(i%2!=0) 
				continue; // 홀수단이라면 조건식 다시 비교
			
			for(j=1;j<=9;++j) {
				System.out.println(i+"*"+j+"="+i*j);
				if(j==i) break; // j가 i와 같다면 반복문 탈출
			}
			System.out.println();
		}
	}
}