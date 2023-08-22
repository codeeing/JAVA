// 230807
abstract class Shape{ // 추상클래스: 추상메소드를 가지고 있음.
	public void make() {
		System.out.println("도형 그리기");
	}
	public Shape() {
		System.out.println("Shape 생성자");
	}
	public abstract void draw(); // 추상메소드: 미완성메소드, 반드시 하위클래스에서 오버라이딩해야함.
	public abstract void delete();
	
}
class Circle extends Shape{
	public Circle() {
		super();
		System.out.println("Circle 생성자");
	}
	public void draw() {
		System.out.println("원을 그립니다.");
	}
	public void delete() {
		System.out.println("원을 지웁니다.");
	}
}

class Triangle extends Shape{
	public Triangle() {
		System.out.println("Triangle 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	public void delete() {
		System.out.println("삼각형을 지웁니다.");
	}
}

public class Ex14_추상메소드 {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스는 객체생성이 불가능하다.
		Shape c = new Circle();
		c.draw();
		c.delete();
		
		Shape t = new Triangle();
		t.draw();
		t.delete();
		
		System.out.println("----------");
		Shape[] sp = {new Circle(), new Triangle()};
		for(int i=0; i<sp.length;++i) {
			sp[i].draw();
			sp[i].delete();
		}
		
	}

}
