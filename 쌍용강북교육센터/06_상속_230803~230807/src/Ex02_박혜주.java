// 230803
class Transport{
	private String name;
	private int price;
	Transport(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// getter
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	String show() {
		return name+"/"+price+"/";
	}
}
class Bus extends Transport{
	private int maxPassenger; // 최대 탑승 승객수
	private int busNumber;
	Bus(String name, int price, int maxPassenger, int busNumber) {
		super(name, price);
		this.maxPassenger = maxPassenger;
		this.busNumber = busNumber;
	}
	int getMaxPassenger() {
		return maxPassenger;
	}
	int getBusNumber() {
		return busNumber;
	}
	String show() {
		return super.show()+maxPassenger+"/"+busNumber;
		// super.show() : 부모의 show메소드를 호출하겠다.
	}
	
}
class ExpressBus extends Transport{
	private String destination;
	private String seat;
	ExpressBus(String name, int price, String destination, String seat) {
		super(name, price);
		this.destination = destination;
		this.seat = seat;
	}
	String getDestination() {
		return destination;
	}
	String getSeat() {
		return seat;
	}
	String show() { // 메서드 오버라이딩(overriding), 리턴타입, 메서드이름, 매개변수 갯수 등 모두 같아야.
		return super.show()+destination+"/"+seat;
		// super.show() : 부모의 show메소드를 호출하겠다.
	}
}

public class Ex02_박혜주 {

	public static void main(String[] args) {
		Bus b = new Bus("시내버스",1000,30,200);
		ExpressBus e = new ExpressBus("고속버스",7000,"부산","A01");
		
		// 멤버변수 모두를 출력
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getMaxPassenger());
		System.out.println(b.getBusNumber());
		System.out.println("-----------------------");
		System.out.println(e.getName());
		System.out.println(e.getPrice());
		System.out.println(e.getDestination());
		System.out.println(e.getSeat());
		System.out.println("-----------------------");
		System.out.println(b.show()); // 자식의 show메소드 호출
		System.out.println(e.show()); // 자식의 show메소드 호출
	}

}
// 오버로딩: 한 클래스내에 여러 메소드
// 오버라이딩: 반드시 상속관계에서 필수적인 문법.