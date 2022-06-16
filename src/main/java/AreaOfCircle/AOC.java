package AreaOfCircle;

import java.util.Scanner;

public class AOC {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter radius value :");
		double radius=s.nextDouble();
		double area=(22*radius*radius)/7;
		System.out.println("Area Of Circle :"+area);
		s.close();
	}

}
