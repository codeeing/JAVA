// 230817
class Bank {
	private int money = 10000;

	// setter, getter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save) {
		money += save;
	}
}

class Park extends Thread {
	public void run() {
		Ex11.myBank.saveMoney(3000); // static변수가 선언이된 클래스의 명으로 접근!!!
		System.out.println("Park money:"+Ex11.myBank.getMoney());
	}

}

class Kim extends Thread {
	public void run() {
		Ex11.myBank.saveMoney(5000);
		System.out.println("Kim money:"+Ex11.myBank.getMoney());
	}
}

public class Ex11 {
	static Bank myBank = new Bank();
	public static void main(String[] args) {
		System.out.println("원금: "+myBank.getMoney());
		
		Park p = new Park();
		Kim k = new Kim();
		p.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		k.start();
	}
}
