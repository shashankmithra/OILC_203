package BaasicPrograms;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int min=sc.nextInt();
		System.out.println("enter max postive integer");
		int max=sc.nextInt();
		for(int i=min;i<=max;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
				sc.close();
			}
		}
	}

}
