// 230727
public class Ex04_증감 {
	public static void main(String[] args) {
		int x, xx, y=7, yy, i;
		x = 3;
		
		System.out.println("x:" + x);
		// x = x + 1;
		// x += 1;
		// x++; // 증가 연산자
		++x; // 증감연산자가 단독일 경우 그냥 +1 하는것.
		System.out.println("x:" + x); // x:4
		
		xx = ++x; // 증가 먼저하고, 그 다음에 대입
		System.out.println("x:" + x); // x:5
		System.out.println("xx:" + xx); // xx:5
		
		xx = x++; // 대입 먼저하고, 그 다음에 증가
		System.out.println("x:" + x); // x:6
		System.out.println("xx:" + xx); // xx:5
		
		System.out.println("--------------------");
		System.out.println("y:" + y); // y:7
		
		yy = --y; // 감소 먼저하고, 그 다음에 대입
		System.out.println("y:" + y); // y:6
		System.out.println("yy:" + yy); // yy:6
		
		yy = y--; // 대입 먼저하고, 그 다음에 감소
		System.out.println("y:" + y); // y:5
		System.out.println("yy:" + yy); // yy:6
		
		i = 10;
		// syso와 함께 나왔기때문에, 전후관계에 의해 증감.
		System.out.println(i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println();
		
		i = 10;
		System.out.println(i); // 10
		System.out.println(i--); // 10
		System.out.println(--i); // 8
		System.out.println(--i); // 7
		System.out.println(i--); // 7
		System.out.println(i); // 6
	}
}
