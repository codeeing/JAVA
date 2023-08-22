// 230808
class Car1 {
	 Car1name name;
	 String color;

	static class Car1name {
		static String model;  
		int year;
		Car1name(String model, int year) {
			this.model = model; 
			this.year = year;
		}
		Car1name(){ 
			
		}
		
	} // static inner 클래스의 끝

	Car1(String model, int year, String color) {
		this.name = new Car1name(model,year);
		this.color = color;
	}
	Car1(){
		
	}
	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}

public class Ex02_스태틱클래스 {
	public static void main(String[] args) {
		Car1 pride = new Car1("프라이드", 2005, "파랑");
		pride.OutInfo(); // 모델 = 프라이드, 년식 = 2005, 색상 = 파랑
		System.out.println(pride.color);
		System.out.println(pride.name.model);
		System.out.println(pride.name.year);
		System.out.println();
		
		Car1 pride2 = new Car1();
		// model변수가 static 변수이기 때문에, 아무것도 출력이 안되는 것이 아니라
		// 아까전에 초기화한 프라이드가 출력되는 것.
		System.out.println(pride2.name.model);  
		
		System.out.println("=====================");
		 
		// 이너클래스 객체를 만들고 싶다면 다음과 같이 접근하면 됨
		Car1.Car1name sonata = new Car1.Car1name("소나타", 2009);
		System.out.printf("모델 = %s, 년식 = %d\n", sonata.model,sonata.year);

		Car1.Car1name sonata2 = new Car1.Car1name(); 
		System.out.printf("모델 = %s, 년식 = %d\n", sonata2.model,sonata2.year);
		
	}
}

