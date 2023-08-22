// 230809

public class Ex02_String {

	public static void main(String[] args) {
		// str1 != str2
		String str1 = new String("Have a nice day");
		String str2 = new String("Have A nice day");
		// str3 == str4
		String str3 = "Have a nice day";
		String str4 = "Have a nice day";
		
		String str5 = "hahaha";
		
		System.out.println(str1); // 주소값이 출력되는 것이 아니라, 배열내용이 출력된다.
		System.out.println(str1.toString()); // String클래스가 toString()을 오버라이딩
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1.length()); // 문자열의 길이 리턴
		System.out.println(str1.equals(str2)); // 대소문자 구분함
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 구분안함
		System.out.println("=========================");
		System.out.println(str1.compareTo(str2)); // 같으면 0 리턴, 다르면 아스키코드값의 차이 리턴
		System.out.println(str1.compareToIgnoreCase(str2)); // 대소문자 구분하지 않음
		
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같다.");
		}else {
			System.out.println("두 문자열은 같지 않다.");
		}
		if(str1.compareTo(str2) == 0) {
			System.out.println("두 문자열은 같다.");
		}else {
			System.out.println("두 문자열은 같지 않다.");
		}
		
		System.out.println(str1.concat(str5)); // 두 문자열을 연결
		System.out.println(str1+str5);
		
		System.out.println(str1.charAt(2)); // 문자열의 2번방에 해당하는 글자를 리턴
		
		System.out.println(str1.indexOf("nice")); // 전달인자에 해당하는 문자열의 시작위치를 리턴. 없으면 -1 리턴
		
		if(str1.indexOf("nice") > -1) {
			System.out.println("해당 문자가 있습니다.");
		}else{
			System.out.println("해당 문자가 없습니다.");
		}
		System.out.println(str1.indexOf('a')); // 0번방에서부터 문자의 시작위치를 리턴
		System.out.println(str1.lastIndexOf('a')); // 마지막방에서부터 문자의 시작위치를 리턴
	
		System.out.println(str1.substring(3, 8)); // 3번방부터 7번방까지의 문자열 리턴	
		System.out.println(str1.substring(5)); // 5번방부터 끝번방까지의 문자열 리턴
		System.out.println(str1.replace('a', 'x'));
		
		System.out.println("=========================");
		String fullName = "Hello.java";
		String fileName; // Hello
		String exit; // java
		System.out.println(fullName.substring(0, fullName.indexOf("."))); // Hello
		System.out.println(fullName.substring(fullName.indexOf(".")+1)); // java
	}

}
