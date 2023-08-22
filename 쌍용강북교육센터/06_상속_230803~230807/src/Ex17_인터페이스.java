// 230807
interface Camera{
	void takePhoto();
}
interface Music{
	void playMusic();
}
interface View{
	void view();
}
class Shape2{
	private int size;
	private String color;
	
	// setter
	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// getter
	public int getSize() {
		return this.size;
	}
	public String getColor() {
		return this.color;
	}
}
// extends가 먼저 나와야 한다.
class Phone extends Shape2 implements Camera, Music{
	public void takePhoto() {
		System.out.println("사진찍기");
	}
	public void playMusic() {
		System.out.println("음악감상");
		
	}
}

public class Ex17_인터페이스 {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.takePhoto();
		p.playMusic();
		p.setSize(10);
		p.setColor("White");
		System.out.println("색:"+p.getColor()+" 사이즈:"+p.getSize());
	}

}
