// 230808
class Car3{
	void drive() {
		System.out.println("부릉 부릉");
	}
}
public class Ex06 {

	public static void main(String[] args) {
		Car3 car = new Car3();
		car.drive();
		
		new Car3(){
			void drive() {
				System.out.println("빵빵");
			}
		}.drive();
	}

}
