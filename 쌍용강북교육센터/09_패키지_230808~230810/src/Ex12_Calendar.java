import java.util.Calendar;

// 230810
public class Ex12_Calendar {

	public static void main(String[] args) {
		
		// Calendar cal = new Calender()// 에러나는 이유: 오버라이딩을 하지 않았기 때문.
		Calendar cal = Calendar.getInstance(); // Calendar형 객체를 리턴
		
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 ");
		System.out.println(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초 ");
		
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
	}

}
