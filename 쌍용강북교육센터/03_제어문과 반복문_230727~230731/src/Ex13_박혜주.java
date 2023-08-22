// 230731 // 주소를 다른말로 참조값(주소상수..?)이라고 함.
public class Ex13_박혜주 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1;i<=100;++i) {
			sum += i;
			if(i%10==0) { // 10의 배수가 될 때마다, 그때까지의 합을 출력
				System.out.println("1~"+i+"="+sum);
			}
		}
		System.out.println();
		sum = 0; //sum 변수 초기화
		
		for(i=1;i<=100;++i) {
			sum += i;
			
			if(i%10==0) {
				//j = i - 9; // 굳이 새 변수에 넣을 필요 없긴 하다.
				System.out.println(i-9+"~"+i+"="+sum);
				sum = 0;
			}
		}
	}
}
