// 230803
class Stu{
	private String name;
	private int kor,eng;
	Stu(){
		name = "웬디";
		kor = 70;
		eng = 80;
	}
	Stu(String name){
		this.name = name;
		kor = 33;
		eng = 44;
	}
	Stu(String name, int kor, int eng) {
		 this.name = name;
		 this.kor = kor;
		 this.eng = eng;
	}
	void display() {
		System.out.println(name+"/"+kor+"/"+eng);
	}
}
public class Ex21_객체배열 {

	public static void main(String[] args) {
		// 배열은 같은 자료형의 집합이다.
		int[] arr = {10,20,30};
		
		Stu s1 = new Stu();
		Stu s2 = new Stu("태연");
		Stu s3 = new Stu("현아",90,80);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("----------------");
//		Stu[] stuArr = new Stu[3];
//		stuArr[0] = new Stu();
//		stuArr[1] = new Stu("태연");
//		stuArr[2] = new Stu("현아",90,80);
		Stu[] stuArr = {new Stu(),
						new Stu("태연"),
						new Stu("현아",90,80)
						};
		stuArr[0].display();
		stuArr[1].display();
		stuArr[2].display();
		System.out.println("----------------");
		
		for(int i=0; i<stuArr.length; ++i) {
			stuArr[i].display();
		}
	}

}
