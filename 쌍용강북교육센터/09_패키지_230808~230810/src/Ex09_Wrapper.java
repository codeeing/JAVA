// 230810

public class Ex09_Wrapper {

	public static void main(String[] args) {
		String[] str = {"윤아:70","아이유:80","최강창민:30"};
		int i, idx;
		int sum = 0;
		String score;
		
		for(i=0;i<str.length;++i) {
//			idx = str[i].indexOf(":");
//			s[core = str[i].substring(idx+1);
//			sum += Integer.parseInt(score);
			
//			sum += Integer.parseInt(str[i].substring(str[i].indexOf(":")+1));
			// 메타문자: + . ? * ...
			sum += Integer.parseInt(str[i].split(":")[1]);
		}
		
		System.out.println("합계: "+sum);
	}
	
}
/*
java.lang
Object, String, StringBuffer, Wrapper(8가지), Math
*/