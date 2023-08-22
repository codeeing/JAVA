// 230809
public class Ex07_Wrapper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		// boxing
		Integer it1 = new Integer(10);
		Integer it2 = new Integer(20);
		System.out.println(it1+it2);
		System.out.println("it1:"+it1.toString());
		//Integer의 toString()으로 오버라이딩 됨
		
		// unboxing
		int it3 = new Integer(10); // int it3 = 10;
		int it4 = new Integer(20);
		System.out.println(it3+it4);
		
		// autoboxing
		Integer it5 = 10; // Integer it5 = new Integer(10);
		Integer it6 = 20;
		System.out.println(it5+it6);
		
		double d = 3.4;
		Double d1 = new Double(10.2);
		Double d2 = 10.2;
		
		System.out.println();
		// 기본타입을 리턴하는 parse메소드
		int i = Integer.parseInt("100"); // 문자열을 int형으로 바꿈
		/// Integer i = Integer.parseInt("100"); // 이렇게 해도 됨.
		int j = Integer.parseInt("200");
		System.out.println("100"+"200");
		System.out.println(i+j);
		
		double q = Double.parseDouble("4.23"); // 4.23
		double w = Double.parseDouble("3"); // 3.0
		System.out.println(q+w); // 7.23
		
		// 클래스타입을 리턴하는 valueof메소드
		Integer x = Integer.valueOf("100");
		// int x = Integer.valueOf("100"); //언박싱이 일어나면서, 이렇게 해도 됨.
		Integer y = Integer.valueOf("200");
		System.out.println(x+y);
	}

}
