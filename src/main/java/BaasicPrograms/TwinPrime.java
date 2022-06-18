package BaasicPrograms;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int min=sc.nextInt();
		System.out.println("enter max postive integer");
		int max=sc.nextInt();
		if(min+2==max) {
			System.out.println("("+min+","+max+")"+ "is a twin prime number ");
		}
		else {
			System.out.println("("+min+","+max+")"+"is a not  twin prime number ");
		}
	}

}
