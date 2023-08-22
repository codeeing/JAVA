// 230802

public class Ex14_Math {

	public static void main(String[] args) {
		int a=30, b=40;
		int result = Math.max(a,b); // 클래스이름으로 호출가능. static 메서드니까.
		System.out.println(result);
		System.out.println(Math.PI);
		// Math.PI = 1.23; // final 변수에 넣으려고 했더니 에러
		System.out.println(Math.abs(-10.123));
		System.out.println(Math.min(1.2,  3.4));
	}
}
