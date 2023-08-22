// 230727
public class Ex07_for {

	public static void main(String[] args) {
		int i,j;
		
		// 이중 for문
		for(i=1; i<=3; ++i) {
			for(j=7; j<=9; ++j) {
				System.out.println(i+","+j);
			} // 안쪽 for문
			System.out.println("--------------------------");
		} // 바깥쪽 for문
		System.out.println("************************");
		System.out.println();
	
		// 이중 for문
		for(i=9; i>=3; i-=3) {
			for(j=3; j<=7; j+=2) {
				System.out.println(i+","+j);
			} // 안쪽 for문
			System.out.println("--------------------------");
		} // 바깥쪽 for문
		
		System.out.println("************************");
		
	}

}
/*
 * 디버그 방법
 * 토글포인트 -> 아무데나 우클릭 -> 디버그 애즈 자바애플리케이션->
 * f6눌러가면서 확인
 */
