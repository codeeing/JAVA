// 230731
// .java => 소스코드
// .class => 바이트코드(소스코드 -> 바이트코드, 이 과정을 컴파일이라고 함)
public class Ex06_2차원 {

	public static void main(String[] args) {
		int[] a = {10,20,30}; // 1차원
		int b = 30;
		
		int[][] arr = { // 2차원, 가변배열(열의 개수가 다른것)
						{10,20},
						{11,22,33,43},
						{12,32,43},
						{32,48}
						};
		System.out.println("arr:"+arr);
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println(arr[0][0]);
//		System.out.println(arr[3][2]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);
		
		int i,j;
		for(i=0;i<arr.length;++i) { // 행
			for(j=0;j<arr[i].length;++j) { // 열
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] arr3 = new int[4][]; 
		System.out.println(arr3[0]); // 와 null값으로 초기화 되어있음.
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr.length); // 4, 
		//System.out.println(arr3[0].length); 
		// null포인터가 가리키는 곳의 길이를 출력하려고 했더니, 에러.
		
		arr3[0] = new int[2];
		arr3[1] = new int[4];
		arr3[2] = new int[3];
		arr3[3] = new int[2];
		
		// arr3 2차원 배열 일부초기화
		arr3[0][0]=10;
		arr3[0][1]=10;
		arr3[1][0]=10;
		for(i=0;i<arr3.length;++i) { // 행, arr3.length는 arr3의 요소의 개수를 반환하므로, 4
			for(j=0;j<arr3[i].length;++j) { // 열
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
