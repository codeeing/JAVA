// 230802
public class Ex09_배열넘기기 {

	public static void main(String[] args) {
//		Ex09 e = new Ex09();
//		e.sub();
		int[] src = {10, 20, 30};
		sub(src[0], src[1], src[2]);
		sub2(src);
		
		int i;
		for(i=0; i<src.length; ++i) {
			System.out.print(src[i]+" "); 
			// sub2 메소드 호출 결과로 인해, src[1]의 값 역시 바뀌게 된다.
			// src의 주소값과 des의 주소값은 같게되므로, 두 참조변수 모두 동일한
			// 배열영역을 가리키게 된다.
		}
		System.out.println();
	}

	static void sub(int a, int b, int c) {
		System.out.println("sub 메서드");
	}
	
	static void sub2(int[] des) {
		System.out.println("sub 메서드");
		int i;
		des[1] = 2222;
		for(i=0; i<des.length; ++i) {
			System.out.println(des[i]);
		}
		System.out.println();
	}
}
