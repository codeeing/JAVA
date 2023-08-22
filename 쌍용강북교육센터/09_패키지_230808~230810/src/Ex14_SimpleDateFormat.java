import java.text.SimpleDateFormat;
import java.util.Date;

// 230810
public class Ex14_SimpleDateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("YY-MM-d일 E요일");
		System.out.println(sdf1.format(now));
		
		// DD: 올해부터 오늘까지 흘러온 일. ex) 222일
		sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss a");
		System.out.println(sdf2.format(now));
	}

}
