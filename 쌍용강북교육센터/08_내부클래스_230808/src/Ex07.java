// 230808
interface RemoteControl{
	public abstract void turnOn();
	void turnOff();
}
public class Ex07 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { // 왜 public을 붙여야 하지??
				System.out.println("TV를 켠다.");
			}
			public void turnOff() {
				System.out.println("TV를 켠다.");				
			}
		};
		rc.turnOn();
		rc.turnOff();
		
	}

}
