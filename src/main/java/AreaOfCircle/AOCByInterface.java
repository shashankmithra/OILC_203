package AreaOfCircle;

import java.util.Scanner;

/**
 *  AREA OF CIRCLE BY USING INTERFACE
 * @author sg22080
 *
 */

interface Circle{
	
	void method();
}
 class AOCByInterface implements Circle {
     double area;
    public void method() {
    	double radius=5;
    	area=(22*radius*radius)/7;
    }
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter radius value :");
		double rad=s.nextDouble();
		AOCByInterface a=new AOCByInterface();
		a.method();
		System.out.println("Area Of Circle :"+a.area);
	s.close();
	}
	
	}
	
		
	


