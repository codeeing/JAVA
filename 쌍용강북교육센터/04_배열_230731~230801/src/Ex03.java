// 230731
public class Ex03 {

	public static void main(String[] args) {
//		int a=3, b=2, c=8;
//		if(a>b) {
//			if(a>c) {
//				// 가장 큰 값은 a
//			}else {
//				// 가장 큰 값은 c
//			}
//		}
//		else {
//			if(b>c) {
//				// 가장 큰 값은 b
//			}else {
//				// 가장 큰 값은 c
//			}
//		} => 너무 복잡한 크기 비교! ! !
		int[] score = {79,83,91,32,98,22,60};
		int max, min, i, sum;
		
		max = score[0]; // 무조건 0번 값을 max에 대입
		min = score[0]; // 무조건 0번 값을 min에 대입
		sum = score[0];
		for(i=1;i<score.length;++i) {
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
			sum += score[i];
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("sum:"+sum);
		System.out.println("avg:"+sum/score.length);
	}

}
