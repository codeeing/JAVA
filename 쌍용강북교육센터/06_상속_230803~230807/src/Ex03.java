// 230804
class Menu{
	private String name; // 메뉴이름
	private int cnt; // 몇 인분?
	private String memo; // 요청사항
	
	public Menu(String name, int cnt, String memo) {
		this.name = name;
		this.cnt = cnt;
		this.memo = memo;
	}
	String show() {
		return name+": "+cnt+"인분, "+memo;
	}
}
class Pasta extends Menu{
	private String type; // 면의 종류
	public Pasta(String name, int cnt, String memo, String type) {
		super(name,cnt,memo);
		this.type = type;
	}
	String show() {
		return super.show()+", "+type;
	}
}
class Tteokbokki extends Menu{
	private int mapgi; // 맵기단계
	public Tteokbokki(String name, int cnt, String memo, int mapgi) {
		super(name,cnt,memo);
		this.mapgi = mapgi;
	}
	String show() {
		return super.show()+", "+mapgi+"단계";
	}
	
}
public class Ex03 {

	public static void main(String[] args) {
		Pasta p = new Pasta("새우크림파스타",2,"새우추가","펜네");
		Tteokbokki t = new Tteokbokki("마라떡볶이",1,"어묵 넣지 말아주세요",3);
		
		System.out.println(p.show());
		System.out.println(t.show());
	}

}
