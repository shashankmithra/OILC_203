package flowcontrols;

import java.util.Scanner;

/**
 * 
 * @author sg22080
 *  FINDING THE LARGEST NUMBER BY USUNF IF..ELSE IF?
 */
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER FIRST NUMBER,SECOND NUMBER AND THIRD NUMBER ?");
		int Firstnumber=sc.nextInt();	
		int Secondnumber=sc.nextInt();
		int Thirdnumber=sc.nextInt();
		if(Firstnumber>Secondnumber && Firstnumber>Thirdnumber) {
			System.out.println("FIRST NUMBER IS LARGEST NUMBER");
		}
		else if(Secondnumber>Thirdnumber && Secondnumber>Firstnumber) {
			System.out.println("SECOND NUMBER IS LARGEST NUMBER");
		}
		else if(Thirdnumber>Firstnumber && Thirdnumber>Secondnumber) {
			System.out.println("Thirdnumber IS LARGEST NUMBER");
		}
		else {
			System.out.println("ANY TWO OR MORE NUMBERS ARE EQUAL");
			sc.close();
		}
	
	}

}
