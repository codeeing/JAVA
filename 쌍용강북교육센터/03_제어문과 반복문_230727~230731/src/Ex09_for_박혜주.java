// 230727_모양만들기
public class Ex09_for_박혜주 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=0; i<5; ++i) {
			for(j=0; j<=i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(i=0; i<5; ++i) {
			for(j=4; j>i; --j) {
				System.out.print(" ");
			}
			for(k=0; k<=i; ++k) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("-----------과제-----------");
		for(i=5; i>0; --i) { // 5
			for(j=1; j<=i; ++j) { // 0 1 2 3 4
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(i=5; i>0; --i) {
			for(j=5; j>i; --j) {
				System.out.print(" ");
			}
			for(k=1; k<=i; ++k) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
