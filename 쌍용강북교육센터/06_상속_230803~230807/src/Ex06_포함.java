// 230804
class Person2{
	private String name;
	private int age;

	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
class Student{
	int kor, eng;
	Person2 p; // 포함, 상속이 아니다

	Student(String name, int age, int kor, int eng){
		p = new Person2(name, age);
		this.kor = kor;
		this.eng = eng;	
	}
	void display() {
		System.out.println(p.getName()+"/"+p.getAge()+"/"+kor+"/"+eng);
	}
}
public class Ex06_포함 {

	public static void main(String[] args) {
		Student s = new Student("kim",30,88,99);
		s.display();
	}

}
