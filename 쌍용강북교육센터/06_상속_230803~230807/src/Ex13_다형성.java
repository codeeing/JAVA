// 230807
class Robot{
	void dance() {
		
	}
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex13_다형성 {
	public static void action(Robot r){
		r = new DanceRobot();
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r; // 다운캐스팅
			dr.dance();	
		}else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r; // 다운캐스팅
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dw = (DrawRobot)r; // 다운캐스팅
			dw.draw();
		}else {;}
		
		
	}
	
	public static void main(String[] args) {
//		Robot[] r = new Robot[3];
//		r[0] = new DanceRobot();
//		r[1] = new SingRobot();
//		r[2] = new DrawRobot();
		
		Robot [] r = {
				new DanceRobot(),
				new SingRobot(),
				new DrawRobot()
				};
//		r[0].dance();
//		r[1].sing();
//		r[2].draw();
		int i;
		for(i=0; i<r.length; ++i) {
			action(r[i]);
		}
	}

}
