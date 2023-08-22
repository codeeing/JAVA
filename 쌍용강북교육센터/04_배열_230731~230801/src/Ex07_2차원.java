// 230731
public class Ex07_2차원 {

	public static void main(String[] args) {
		int i,j;
		int[][] arr = {{1,2,3,4}, {5,6,7,8}};
		
		for(i=0; i<arr.length;++i) {
			for(j=0;j<arr[i].length;++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("----------");
		// int[] x = {1,2,3,4}
		// int[] x = {5,6,7,8}
		// 확장for문 사용하여 2차원 배열 출력
		for(int[] x : arr) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
