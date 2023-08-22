// 230731
public class Ex08_박혜주 {

	public static void main(String[] args) {
		int[][] a = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
					};
		
		int[][] b = {
						{3,4,3},
						{2,5,7},
						{9,4,5}
					};
		int[][] c = new int[3][3];
		int i,j;
		System.out.println("c");
		for(i=0;i<c.length;++i) { // 3행
			for(j=0;j<c[i].length;++j) { // 3열
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
/*
a
1 2 3
4 5 6
7 8 9

b
3 4 3
2 5 7
9 4 5

c
4 6 6
6 10 13
16 12 14
*/