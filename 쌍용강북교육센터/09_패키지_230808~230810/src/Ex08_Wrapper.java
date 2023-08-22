// 230810
public class Ex08_Wrapper {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		int sum = 0;
		int i;
		
		for(i=0;i<num.length;++i) {
			sum += num[i];
		}
		System.out.println("합계: " + sum);
		
		String[] num2 = {"1","2","3","4","5"};
		sum = 0;
		String sum3 = "";
		for(i=0;i<num2.length;++i) {
			sum += Integer.parseInt(num2[i]);
			sum3 += num2[i];
		}
		System.out.println("합계: " + sum);
		System.out.println("합계: " + sum3); // 문자열이 그냥 연결됨
		
		
	}

}
