// 230727
public class Ex05_삼항 {
	public static void main(String[] args) {
		/*
		 * 삼항연산자 (조건연산자, 피연산자가 3개 필요)
		 * (조건문) ? T : F
		 */
		int a = 11, b = 20;
		int result = a < b ? a : b;
		System.out.println(result);
		
		String result2 = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result2);
		
	}
}

/*
이항연산자 (피연산자가 2개 필요)
+ - * % / > == != && || ...

단항연산자 (피연산자가 1개 필요)
++ -- + - !
*/