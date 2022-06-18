package Calculate_Discount;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		double disc,amount,MP,s;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter marked price ");
		MP=sc.nextDouble();
		
		System.out.println("enter discount percentage");
		disc=sc.nextDouble(); //35 means 35% = 0.35
		
		System.out.println("marked price= +"+MP);
		System.out.println("discount rate= "+disc);
		s=100-disc;
		amount=(s*MP)/100;
		System.out.println("amount after discount= "+amount);
	} 

}
