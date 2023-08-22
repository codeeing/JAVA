import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 230818
public class Ex11 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(System.in); // Scanner(InputStream source)
		//int a = sc.nextInt();
		
		Scanner sc = new Scanner(new File("data2.txt"));
		sc.useDelimiter(",");
		
		int sum = 0, num;
		while(sc.hasNextInt()) {
			num = sc.nextInt();
			System.out.println(num);
			sum += num;
		}
		System.out.println("sum:"+sum);
		sc.close();
	}

}
