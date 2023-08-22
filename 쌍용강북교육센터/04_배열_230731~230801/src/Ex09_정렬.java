// 230801
public class Ex09_정렬 {

	public static void main(String[] args) {
//		SWAP 알고리즘
		int x = 10, y = 20, z;
		System.out.println(x+","+y); // 10, 20
		z = x;
		x = y;
		y = z;
		System.out.println(x+","+y); // 20, 10 // SWAP 완료
		System.out.println("--------");
		int[] arr = {8, 3, 5, 2, 9}; // 23589
		int i,j,temp;
		for(i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		// 선택정렬
		for(i=0;i<arr.length-1;++i) { // 천천히, 기준(0~3)
			for(j=i+1;j<arr.length;++j) {
				if(arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} // if
			} // 안쪽for
		} // 바깥쪽for
		for(i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+"\t");
		} // 정렬완료
	}
}
