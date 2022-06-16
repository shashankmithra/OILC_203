package flowcontrols;
/**
 * WAP to print     1 2 3 4 5
 *                  2 4 6 8 10
 *                  3 6 9 12 15
 *                  4 8 12 16 20
 *                  5 10 15 20 25
 * @author sg22080
 *
 */
public class Pattern9 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i*j+" ");  // 1x1 1x2 1x3 1x4 1x5		
	}                                       // 2x1 2x2 2x3 2x4 2x5
			System.out.println();           // 3x1 3x2 3x3 3x4 3x5
                                            // 4x1 4x2 4x3 4x4 4x5
}}}          								// 5x1 5x2 5x3 5x4 5x5
