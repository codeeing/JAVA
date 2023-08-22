// 230731
public class Ex01 {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
//		3가지 방식의 배열 선언 및 초기화
//		int[] arr = {10,20,30}; // arr은 C로 따지면 포인터인듯.
//		int[] arr = new int[] {10,20,30}; // 12line과 같은 표현
		int[] arr = new int[3]; // int형 방이 3개인 배열. 제로초기화.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]); // 방번호 == 인덱스, 첨자
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = 11;
		System.out.println(arr[0]);
		System.out.println("----");
		System.out.println();
	
		System.out.println("arr.length"+arr.length);
		
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// for(변수 : 반복할 대상), 확장 for문이라고 한다.
		for(int x : arr) {
			System.out.println(x);
		}
	}
	

}
