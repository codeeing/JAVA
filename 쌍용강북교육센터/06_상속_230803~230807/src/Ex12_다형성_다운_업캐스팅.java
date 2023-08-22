// 230807
class Car{
	String color = "white";
	int door = 4;
	
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	int door = 6;
	int wheel = 10;
	void drive() { // 메서드 오버라이딩
		System.out.println("FEdrive~");
	}
	void water() {
		System.out.println("water!");
	}
}

public class Ex12_다형성_다운_업캐스팅 {

	public static void main(String[] args) {
		
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		fe.drive();
		System.out.println(fe.color);
		System.out.println(fe.door);
		
		// 업캐스팅, 자식의 주소를 부모의 주소공간에 대입하는 것.
		c = fe; // 부모의 주소를 더 크다고 본다.
		System.out.println(c.color);
		System.out.println(c.door);
//		System.out.println(c.wheel);
		
		c.drive(); // 부모가 가지고 있음. 버추얼 문법 관련인듯
		c.stop();
		//c.water(); // 부모가 안 가지고 있음. 오버라이딩 안 되어있음.
		
		// instanceof 도 연산자이다. 결과는 true 아니면 false이다.
		// 업캐스팅한 코드가 있어야, 다운캐스팅도 가능하다.
		if(c instanceof FireEngine) { // 변수 instanceof 클래스
			System.out.println("다운 캐스팅 가능");
		}else {
			System.out.println("다운 캐스팅 불가능");
		}
		// 다운캐스팅, 상위클래스의 주소를 하위클래스의 주소로 대입할때.
		fe2 = (FireEngine) c; 
		System.out.println(fe2.color); // white
		System.out.println(fe2.door); // 6
		fe2.stop(); // stop!
		fe2.drive(); // FEdrive~
	}

}
// 다형성
// 하나의 참조 변수로 여러타입의 객체를 참조할 수 있는것
// 업캐스팅: 부모의 참조변수에 자식의 참조변수를 대입
// 다운캐스팅: 자식의 참조변수에 부모의 참조변수를 대입. 강제형변환이 꼭 필요.
//			다운캐스팅은 함부로 하면 안되고, 반드시 업캐스팅이 선행이 된 후에
//			다운캐스팅을 진행해야 한다.