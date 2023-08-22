// 230809
public class Ex04_박혜주 {

	public static void main(String[] args) {
		
		int i;
		String str = "Victory bElongs to the moSt peRsevering";
		int[] alphabet = new int[26];
		
		str = str.toLowerCase();
		
		// 한문자씩 읽어들인 후 개수 저장
		for(i=0;i<str.length();++i) {
			if(str.charAt(i) == ' ') continue;
			++alphabet[str.charAt(i)-'a'];
		}
		// 출력
		for(i=0;i<alphabet.length;++i)
			System.out.printf("%c:%d\n",'a'+i,alphabet[i]);
	}

}