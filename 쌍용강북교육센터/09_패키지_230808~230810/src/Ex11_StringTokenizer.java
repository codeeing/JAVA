import java.util.StringTokenizer;

// 230810
public class Ex11_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer(문자열, 구분자): 
		// 뒤에 오는 구분자를 기준으로 앞의 문자열을 쪼갠다(파싱한다).
		// 구분자를 써주면, 기본 구분자인 공백을 기준으로 문자열을 쪼개지 않는다.
		StringTokenizer stz = new StringTokenizer("2023/08/10,11:37",":/");
		
		System.out.println("stz: "+stz);
		
		 // 쪼개진 덩어리의 개수를 리턴
		System.out.println("stz.countTokens(): "+stz.countTokens());
		
		while(stz.hasMoreTokens()) { // 파싱할 토큰이 더 있니? true면 돌아라.
			System.out.println("stz.nextToken(): "+stz.nextToken());
		}
		
		System.out.println("======================");
		/// "23+31+12+7" => 합계?
		StringTokenizer stz2 = new StringTokenizer("23+31+12+7", "+");
		int sum = 0;
		
		while(stz2.hasMoreTokens()) {
			sum += Integer.parseInt(stz2.nextToken());
		}
		System.out.println(sum);
		System.out.println("======================");
		String s2 = "23+31+12+7";
		String[] arr = s2.split("\\+"); // 구분자는 하나만 넣을 수 있다. 더하기를 넣을땐 역슬래시를 넣어야함
		System.out.println(arr.length);
		int i;
		sum = 0;
		for(i=0;i<arr.length;++i) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}

}
/*
객체를 만들면 생성자가 호출된다.
쪼개는 것을 parsing(파싱)한다고 한다.
*/