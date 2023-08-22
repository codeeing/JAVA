// 230727_구구단
public class Ex08_for_박혜주 {

	public static void main(String[] args) {
		int i,j;
		for(i=2; i<=9; ++i) {
			System.out.println("***"+i+"단***");
			for(j=1; j<=9; ++j) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("구구단 가로 출력");
		for(i=1; i<=9; ++i) {
			for(j=2; j<=9; ++j) {
				System.out.print(j+"*"+i+"="+j*i+'\t');
			}
			System.out.println();
		}
	}
}
