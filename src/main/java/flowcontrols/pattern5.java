package flowcontrols;
/**
 * WAP to print in a pattern 5 4 3 2 1
 *                           5 4 3 2 1
 *                           5 4 3 2 1 
 *                           5 4 3 2 1
 *                           5 4 3 2 1
 *                     
 * @author sg22080
 *
 */
public class pattern5 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
