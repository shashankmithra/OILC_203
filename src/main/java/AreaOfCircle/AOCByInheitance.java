package AreaOfCircle;

import java.util.Scanner;

public class AOCByInheitance {
	double area;
	void circle(double r) {
		area=(22*r*r)/7;
	}}
	class Area extends AOCByInheitance{

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("Enter radius value :");
		double rad=s.nextDouble();
		Area r=new Area();
		r.circle(rad);
		System.out.println("Are Of Circle :"+ r.area);
	}

}
