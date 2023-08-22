// 230731
public class Ex11_break_continue {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;++i) { // 1~10
			if(i==5) break; // 즉시 반복문 탈출
			System.out.println(i);
		}
		System.out.println("--------");
		for(i=1;i<=10;++i) { // 1~10
			if(i==5) continue; // 즉시 조건식 비교
			System.out.println(i);
		}
		
		
	}

}
