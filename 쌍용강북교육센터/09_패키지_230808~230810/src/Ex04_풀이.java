// 230810
public class Ex04_풀이 {

	public static void main(String[] args) {
		
		String str = "Victory bElongs to the moSt peRsevering";
		System.out.println((int)'a');
		System.out.println((int)' ');
		int[] num = new int[26];
		int i;
		for(i=0;i<num.length;++i) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println(str.length());
		for(i=0;i<str.length();++i) {
			char c = str.charAt(i);
			//System.out.println(c);
			if(c>='A' && c<='Z') { // 65~90
				num[c-65]++;
			}else if(c>='a' && c<='z') { // 97~122
				num[c-97]++;
			}
		}
		
		for(i=0;i<num.length;++i) { // 25번 실행
			System.out.println((char)(97+i)+":"+num[i]);
		}
	}
}