// 230731
public class Ex05 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int i;
		for(i=0; i<arr.length; ++i) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int[] arr2 = new int[5];
		System.out.println("arr:"+arr);
		System.out.println("arr2:"+arr2);
		
		for(i=0; i<arr2.length; ++i) {
			System.out.println(arr2[i]+" ");
		}
		System.out.println();
		
		arr2 = arr;
		for(i=0; i<arr2.length; ++i) {
			System.out.println(arr2[i]+" ");
		}
		System.out.println();
		arr[1] = 111;
		System.out.println(arr2[1]);
	}

}
