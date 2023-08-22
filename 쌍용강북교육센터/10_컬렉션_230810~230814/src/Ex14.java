import java.util.ArrayList;

// 230814
public class Ex14 {

	public static void main(String[] args) {
		int[] arr = new int[1000000];
		int i;
		
		long start = System.currentTimeMillis();
		System.out.println("start:"+start);
		for(i=0;i<arr.length;++i) {
			arr[i] = i;
		}
		long end = System.currentTimeMillis();
		System.out.println("end:"+end);
		System.out.println("time:"+(end-start)); // 0.004초 걸림
		System.out.println("=======================");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		start = System.currentTimeMillis();
		System.out.println("start:"+start);
		for(i=0;i<arr.length;++i) {
			list.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("end:"+end);
		System.out.println("time:"+(end-start)); // 0.026초 걸림
	}

}
/*
배열 vs Collection
*/