// 230802
public class Ex12_재귀호출 {

	public static void main(String[] args) {
		// 4! => 4*3*2*1=24
		System.out.println("4! = " + fact(4));
		System.out.println("4! = " + fact2(4));
	}
	static int fact(int num) {
		if(num==1) return 1;
		else return num*fact(num-1);
	}
	
	static int fact2(int n) {
		int i,res = 1;
		for(i=n;i>=1;--i) {
			res *= i;
		}
		return res;
	}
}
