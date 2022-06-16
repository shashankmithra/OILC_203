package AreaOfCircle;

import java.util.Scanner;

/**
 * AOC ByUsing Constructor
 * @author sg22080
 *
 */
  
public class AreaByConstructor {
	double area;
	AreaByConstructor (double r){
		area=(22*r*r)/7;
	}

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter radius value :");
		double rad=s.nextDouble();
		AreaByConstructor a=new AreaByConstructor(rad);
		System.out.println("Area Of Circle :"+a.area);
         s.close();
	}

}
