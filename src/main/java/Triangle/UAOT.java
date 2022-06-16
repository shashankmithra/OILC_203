package Triangle;

import java.util.Scanner;

public class UAOT {
	static double AOT(double b,double h)
	{

		return ((b*h)/2);
	}

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("ENTER HEIGHT OF TRIANGLE :");
		double h= s.nextDouble();
		System.out.println("ENTER BASE OF TRIANGLE :");
		double b = s.nextDouble();
		double area=AOT(b,h);
	    System.out.println("AREA OF TRIANGLE :"+area);
		s.close();

	}

}
