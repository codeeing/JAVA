abstract class Employee3{
	private String empno;
	private String name;
	private int pay;
	
	public Employee3(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	public abstract double getMonthPay();
	public String toString() {
		return empno+","+name+","+pay;
	}
	public int getPay() {
		return pay;
	}
}
class FullTime2 extends Employee3{
	private int bonus;
	
	public FullTime2(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	public double getMonthPay() {
		return (getPay()/(double)12)+(bonus/(double)12);
	}
	public String toString() {
		return super.toString()+","+bonus;
	}
}
class Contract2 extends Employee3{
	private int hireYear;
	
	public Contract2(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	public double getMonthPay() {
		return getPay()/(double)12*hireYear;
	}
	public String toString() {
		return super.toString()+","+hireYear;
	}
}
class PartTime2 extends Employee3{
	private int workDay;
	
	public PartTime2(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	public double getMonthPay() {
		return getPay()*workDay;
	}
	public String toString() {
		return super.toString()+","+workDay;
	}
}
public class Ex15_풀이 {

	public static void main(String[] args) {
		Employee3 p = new PartTime2("P001","이승기",300,7);
		Employee3 c = new Contract2("C001","웬디",200,3);
		Employee3 f = new FullTime2("F001","김혜수",400,700);
		
		Employee3[] ep = {
				new PartTime2("P001","이승기",300,7),
				new Contract2("C001","웬디",200,3),
				new FullTime2("F001","김혜수",400,700)
				};
		
		for(int i=0; i<ep.length; ++i) {
			// toString 함수는 참조변수만을 써서 호출할 수 있으니까!!
			System.out.println(ep[i]);
			System.out.printf("%.1f\n", ep[i].getMonthPay());
			System.out.println();
		}
	}

}
