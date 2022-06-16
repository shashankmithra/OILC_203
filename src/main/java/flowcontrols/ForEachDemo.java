package flowcontrols;

//import java.lang.reflect.Array;

public class ForEachDemo {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println("----Normal For Loop----");
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("----For Each Loop------");
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
