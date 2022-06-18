package Equlater;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the side of the triangle:");
		double a=sc.nextDouble();
		double area=(Math.sqrt(3)/4)*(a*a);
		System.out.println("Area Of Triangle is: "+ area);

	}

}
