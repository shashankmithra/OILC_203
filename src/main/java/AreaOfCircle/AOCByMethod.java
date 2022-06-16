package AreaOfCircle;

import java.util.Scanner;

public class AOCByMethod {
	static double area(double r) {
		return (22*r*r)/7;
	}

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter radius value :");
		double rad=s.nextDouble();
		double a=area(rad);
		System.out.println("Area Of Circle :"+a);
		s.close();
	}

}
