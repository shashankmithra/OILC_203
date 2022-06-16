package Triangle;

import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("ENTER HEIGHT OF TRIANGLE :");
		double h= s.nextDouble();
		System.out.println("ENTER BASE OF TRIANGLE :");
		double b = s.nextDouble();
		double area=((b*h)/2);
		System.out.println("AREA OF TRIANGLE :"+area);
		
	}

}
