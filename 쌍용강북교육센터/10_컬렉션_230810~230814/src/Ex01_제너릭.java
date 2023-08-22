// 230810
// 아주 중요한 컬렉션 ! ! !
class Top<T>{ // 제너릭, 객체를 만들때 타입이 확정된다.
	private T data;

	// setter, getter
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
public class Ex01_제너릭 {

	public static void main(String[] args) {
		String str = "hello";
		Top<String> t = new Top<String>();
		
		t.setData(str);
		String s = t.getData();
		System.out.println("s: "+s);
		
		// 반드시 클래스형태로만 써야한다!! int, double 이렇게 쓸 수 없다.
		Top<Integer> t2 = new Top<Integer>();
		t2.setData(10);
		Integer it = t2.getData();
		System.out.println("it: "+it);
		
		Top<Double> t3 = new Top<Double>();
		t3.setData(9.5);
		Double dt = t3.getData();
		System.out.println("dt: "+dt);
	}

}
