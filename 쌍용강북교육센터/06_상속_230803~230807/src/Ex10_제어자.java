// 다른 패키지에 사용할 클래스가 있다면,
// 임포트 해주어야 한다.
import com.javastudy.Car;

// 230804
public class Ex10_제어자 {

	public static void main(String[] args) {
		Car c = new Car("모닝", 200);
		c.prnCar();
	}

}
//접근제어자
//public, protected, default, private
//public: 동일패키지 뿐만아니라, 다른 모든 패키지에서 접근 가능
//protected: 동일패키지내에서 접근 가능, 다른 패키지의 자식클래스만이 접근가능
//default: 동일패키지내에서만 접근 가능
//private: 동일패키지의 다른 클래스에서도 접근 불가능. 해당 클래스에서만 접근 가능하다.

//제어자
//final 클래스: 더이상 상속받지 못하도록 하기 위해서, 클래스 앞에 final을 붙힌다.
//final 메서드: 자식이 더이상 오버라이딩을 하지 못하도록, 메서드 앞에 final을 붙힌다.\
//final 변수: 위에 두개보다 사용빈도가 높다. public static final을 함께 쓰는 경향이 있다.
//			값이 수정되지 않도록 하기위해 사용.
