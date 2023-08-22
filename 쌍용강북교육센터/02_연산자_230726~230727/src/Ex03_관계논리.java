// 230726
public class Ex03_관계논리 {
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		boolean c = a<b; // c = true
		c = a == b;
		System.out.println("c:" + c);
		System.out.println(a == b);
		System.out.println(a != b);
		
		c = a>10 && b>10; // F && T = F
		System.out.println("c:" + c);
		
		c = a>10 || b>10; // F || T = T
		System.out.println("c:" + c); // c:true
		System.out.println("c:" + !c); // c:false
		
	}
}

/*
 <and 연산자, &&>
 T && T => T
 T && F => F
 F && T => F
 F && F => F
 
 <or 연산자, ||>
 T || T => T
 T || F => T
 F || T => T
 F || F => F
 
 <not 연산자, !>
 !T => F
 !F => T
*/