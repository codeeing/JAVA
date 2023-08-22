import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex06_Vector {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		
		v.add("봄");
		v.add(new String("여름"));
		v.add("봄");
		v.add("겨울");
		System.out.println(v.size());
		System.out.println(v.get(1));
		
		System.out.println("v:" + v);
		for(String x : v) {
			System.out.println(x);
		}
		System.out.println();
		
		Iterator<String> ite = v.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println();
		
		Enumeration<String> enu = v.elements();
		while(enu.hasMoreElements()) {
			String s = enu.nextElement();
			System.out.println(s);
		}
	}
}

