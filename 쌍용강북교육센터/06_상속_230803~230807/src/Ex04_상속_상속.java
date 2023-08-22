// 230804
class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// 나중에 설명!! 일단 public을 꼭 붙여야한다는 것만 알아라
	public String toString(){
		return name+"/"+age;
	}
}

class Employee extends Person{
	private String workplace;
	private String part;
	
	Employee(String name, int age, String workplace, String part){
		super(name, age);
		this.workplace = workplace;
		this.part = part;
	}
	// 오버라이딩
	public String toString(){
		return super.toString()+"/"+workplace+"/"+part;
	}
}

class Teacher extends Employee{
	private String subject;
	
	Teacher(String name, int age, String workplace, String part, String subject){
		super(name, age, workplace, part);
		this.subject = subject;
	}
	// 오버라이딩
	public String toString(){
		return super.toString()+"/"+subject;
	}
}
public class Ex04_상속_상속 {

	public static void main(String[] args) {
		Person p = new Person("박세리", 50);
		Employee e = new Employee("윤아",30,"쌍용","연구부");
		Teacher t = new Teacher("웬디",20,"한국고","생활지도부","음악");
		
		System.out.println(p.toString());
		System.out.println(p); // 참조변수 뒤에 .toString()이 자동으로 붙는다.

		System.out.println(e);
		System.out.println(t);
	}

}
