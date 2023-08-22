import java.util.ArrayList;

// 230811
class Person{
	private String id;
	private String pw;
	
	// cons.
	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	// setter, getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
public class Ex03_ArrayList {

	public static void main(String[] args) {
//		Person p1 = new Person("kim","1234");
//		Person p2 = new Person("park","5678");
//		Person p3 = new Person("jung","9876");
		
		Person[] pp = {
						new Person("kim","1234"),
						new Person("park","5678"),
						new Person("jung","9876")
						};
		
		ArrayList<Person> list = new ArrayList<Person>();
		System.out.println(list.size());
		for(int i=0; i<pp.length; ++i) {
			list.add(pp[i]);
		}
		System.out.println(list.size());
	}
}

