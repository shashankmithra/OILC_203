package Factorials;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		long l,fact=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER BASE VALUE :");
		long n=sc.nextLong();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.println("factorial value :"+fact);
	}

}
