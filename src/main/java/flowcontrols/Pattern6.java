package flowcontrols;
/**
 * WAP to print 1 2 3 4 5
 *              6 7 8 9 10
 *              11 12 13 14 15
 *              16 17 18 19 20
 *              21 22 23 24 25
 */


import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter value of n :");
		//int n=sc.nextInt();
		int k=1,n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
				//sc.close();
			}
			System.out.println();
		}
		
	}

}
