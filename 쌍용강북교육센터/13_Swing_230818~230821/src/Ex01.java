import java.awt.Frame; // awt패키지

// 230818
public class Ex01 {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 생성");
		f.setSize(400, 300);
		//f.setTitle("프레임 생성");
		f.setLocation(100, 300); // 최초 위치 설정
		f.setVisible(true);
	}

}
