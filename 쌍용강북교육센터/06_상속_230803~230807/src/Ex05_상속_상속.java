// 230804
class Food{
	private String name;
	private String flavor;
	Food(String name, String flavor){
		this.name = name;
		this.flavor = flavor;
	}
	public String toString(){
		return name+"/"+flavor;
	}
}
class Dessert extends Food{
	private String state; // 액체? 고체?
	private int price;
	Dessert(String name, String flavor, String state, int price) {
		super(name, flavor);
		this.state = state;
		this.price = price;
	}
	public String toString(){
		return super.toString()+"/"+state+"/"+price;
	}
}
class Macarong extends Dessert{
	private boolean ddung;
	Macarong(String name, String flavor, String state, int price, boolean ddung) {
		super(name, flavor, state, price);
		this.ddung = ddung;
	}
	public String toString(){
		return super.toString()+"/"+ddung;
	}
}
public class Ex05_상속_상속 {

	public static void main(String[] args) {
		Food f = new Food("김치찌개", "매운맛");
		Dessert d = new Dessert("케이크", "치즈맛", "고체", 27000);
		Macarong m = new Macarong("마카롱","민트초코맛","고체",3000,true);
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(m);
	}

}
