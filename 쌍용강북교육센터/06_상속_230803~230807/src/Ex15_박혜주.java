// 230807
abstract class Employee2{
	private String empno;
	private String name;
	private int pay;
	public abstract double getMonthPay();
	
	public Employee2(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	// getter
	public int getPay() {
		return pay;
	}
	public String display() {
		return empno+","+name+","+pay;
	}
} 
class FullTime extends Employee2{
	private int bonus;
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	public double getMonthPay() {
		return (getPay()/(double)12)+(bonus/(double)12);
	}
	public String display() {
		return super.display()+","+bonus;
	}
}
class Contract extends Employee2{
	private int hireYear;
	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	public double getMonthPay() {
		return getPay()/(double)12*hireYear;
	}
	public String display() {
		return super.display()+","+hireYear;
	}
}
class PartTime extends Employee2{
	private int workDay;
	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	public double getMonthPay() {
		return getPay()*workDay;
	}
	public String display() {
		return super.display()+","+workDay;
	}
}
public class Ex15_박혜주 {

	public static void main(String[] args) {
//		PartTime p = new PartTime("P001","이승기",300,7);
//		Contract c = new Contract("C001","웬디",200,3);
//		FullTime f = new FullTime("F001","김혜수",400,700);
		
		// 배열처리
		Employee2[] ep = {new PartTime("P001","이승기",300,7),
						new Contract("C001","웬디",200,3),
						new FullTime("F001","김혜수",400,700)};
		for(int i=0; i<ep.length; ++i) {
			System.out.println(ep[i].display());
			System.out.println(ep[i].getMonthPay());
			System.out.println();
		}
	}

}
