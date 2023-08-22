// 230727
public class Ex05_for {

	public static void main(String[] args) {
		int i, sum;
		for(i=1; i<=5; ++i) {
			System.out.println("hello: " + i);
		}
		System.out.println("for문 밖: " + i);
		
		for(i=5; i>0; --i) {
			System.out.println("hello: " + i);
		}
		System.out.println("for문 밖: " + i);
		
		sum = 0;
		for(i=1; i<=10; ++i) { // 1부터 10까지의 합계
			//System.out.println(i);
			sum += i;
		}
		System.out.println("sum:"+ sum);

		sum = 0;
		for(i=1; i<=10; i+=2) { // 1 3 5 7 9의 합계
			//System.out.println(i);
			sum += i;
		}
		System.out.println("sum:"+ sum);
		
		int even = 0; // 짝수의 합계
		int odd = 0; // 홀수의 합계
		for(i=1; i<=10; ++i) {
			if(i%2==0) even += i;
			else odd += i;
		}
		System.out.println("짝수의 합:" + even);
		System.out.println("홀수의 합:" + odd);
	}

}
/* 형식
for(초기식; 조건식; 증감식) {
	반복할 문장;
}
초기식부터 조거식이 될때까지 증감식을 거쳐 반복
*/