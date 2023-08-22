// 230731
public class Ex02 {

	public static void main(String[] args) {
//		3가지 방식으로 배열을 만든 후 출력하기
//		double[] arr = {1.1, 2.2, 3.3};
//		double[] arr = new double[] {1.1, 2.2, 3.3};
		double[] arr = new double[3]; // arr을 참조변수라고 한다. 32bit => arr의 크기 4B, 64bit => arr의 크기 8B
		arr[0] = 1.1;
		arr[1] = 2.2;
		arr[2] = 3.3;
		
		for(double x : arr) {
			System.out.println(x);
		}
		System.out.println();
		
	}

}
