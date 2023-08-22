// 230803
class Sports{ // 부모(슈퍼)클래스
	private String name;
	private int inwon;
	
	Sports(){
		System.out.println("Sports() 생성자");
	}
	Sports(String name, int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	// 부모의 메소드들 역시 상속이 된다.
	String getName() {
		return name;
	}
	int getInwon() {
		return inwon;
	}
	void display() {
		System.out.print(name+"/"+inwon+"/");
	}
}
class Baseball extends Sports{ // class 자식클래스 extends 부모클래스
//	String name;
//	int inwon;
	private double ta;
	
	Baseball(){
		// super(); // 부모생성자를 호출해라. 기본적으로 들어가있는 코드.
		System.out.println("Baseball() 생성자");
	}

	Baseball(String name, int inwon, double ta) {
		super(name,inwon);
		System.out.println("Baseball(String name, int inwon, double ta)");
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	void display() {
		super.display();
		System.out.println(ta);
	}
	double getTa() {
		return ta;
	}
}
class Football extends Sports{
//	String name;
//	int inwon;
	private int goal;
	
	Football(){
		System.out.println("Football() 생성자");
	}

	Football(String name, int inwon, int goal) {
		super(name, inwon);
		System.out.println("Football(String name, int inwon, int goal) 생성자");
		this.goal = goal;
	}
	void display() {
		super.display();
		System.out.println(goal);
	}
	int getGoal() {
		return goal;
	}
}
public class Ex01_상속 {

	public static void main(String[] args) {
		
//		Sports s1 = new Sports();
//		s1.name = "스포츠";
//		s1.inwon = 100;
//		System.out.println(s1.name);
//		System.out.println(s1.inwon);
//		System.out.println("------------------------");
		
//		Baseball b = new Baseball();
//		b.name = "야구";
//		b.inwon = 9;
//		b.ta = 0.37;
//		System.out.println(b.name);
//		System.out.println(b.inwon);
//		System.out.println(b.ta);
//		b.display();
//		System.out.println("------------------------");
		
		Baseball b2 = new Baseball("야구2",10,0.78);
		System.out.println(b2.getName());
		System.out.println(b2.getInwon());
		System.out.println(b2.getTa());
		b2.display();
		System.out.println("------------------------");
		
//		Football f = new Football();
//		f.name = "축구";
//		f.inwon = 11;
//		f.goal = 3;
//		System.out.println(f.name);
//		System.out.println(f.inwon);
//		System.out.println(f.goal);
//		f.display();
//		System.out.println("------------------------");
		
		Football f2 = new Football("축구2",12,5);
		System.out.println(f2.getName());
		System.out.println(f2.getInwon());
		System.out.println(f2.getGoal());
		f2.display();
		
		System.out.println("========================");
		Sports[] sp = {
						new Baseball("야구2",10,0.78),
						new Football("축구2",12,5)
					  };
		int i;
		for(i=0; i<sp.length;++i) {
//			System.out.println(sp[i].getName());
//			System.out.println(sp[i].getInwon());
//			System.out.println(((Baseball) sp[i]).getTa());
			sp[i].display();
		}
		
		
	}

}

// super(); => 생성자의 첫줄에 들어가있음.