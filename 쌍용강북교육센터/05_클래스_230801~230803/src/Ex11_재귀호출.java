// 230802
public class Ex11_재귀호출 { // 재귀호출: 내가 나를 부름.

	public static void main(String[] args) {
		show(3);
	}
	static void show(int num) {
		System.out.println("Hi~"+num);
		if(num==1)
			return;
		show(--num);
		// show(num--); // 무한재귀!! show(num)을 먼저 실행하고, 나중에 넘값을 빼기 때문,,,, 
	}
}
