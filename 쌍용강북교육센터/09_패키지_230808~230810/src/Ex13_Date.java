import java.util.Date;

public class Ex13_Date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.getYear()+1900+"년 "); // 1900년부터 지금까지 123년이 흘렀다.
		System.out.println(now.getMonth()+1+"월 ");
		System.out.println(now.getDate()+"일 ");
		
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println(now.getDay());
		System.out.println(week[now.getDay()]+"요일");
	}

}
