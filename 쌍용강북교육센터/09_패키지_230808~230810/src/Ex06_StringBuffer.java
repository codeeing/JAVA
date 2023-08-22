// 230809
public class Ex06_StringBuffer {

	public static void main(String[] args) {
		String str1 = "Have ";
		String str2 = "a ";
		String str3 = "nice day";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
		
		String str5 = str4.replace("nice","good");
		System.out.println(str5);
		System.out.println();
		
		// StringBuffer가 String보다 더 빠르다.
		StringBuffer sb = new StringBuffer("Have "); // 반드시 new와 함께 써줘야한다.
		StringBuffer sb2 = new StringBuffer("Have ");
		
		System.out.println(sb.equals(sb2)); // StringBuffer클래스는 equals를 오버라이딩 하지 않았나보다.
		
		// 여기서 toString()은 StringBuffer를 
		// String형으로 바꾸는 기능으로 오버라이딩 함.
		String ss = sb.toString();
		String ss2 = sb2.toString();
		
		System.out.println(ss.equals(ss2));
		System.out.println("==========================");
		
		sb.append("a ");
		sb.append("nice day");
		System.out.println(sb);
		sb.replace(7, 11, "good");
		System.out.println(sb);
		
		sb.insert(7, "abc"); // 7번방에 abc 삽입
		System.out.println(sb);
		
		sb.delete(7, 9); // 7번방부터 9번방 삭제
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb); // 문자열을 거꾸로
		
		System.out.println("==========================");
		
		System.out.println(ss);
		System.out.println(ss2);
		
	}

}
