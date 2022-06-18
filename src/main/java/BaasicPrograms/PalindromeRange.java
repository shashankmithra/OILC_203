package BaasicPrograms;

import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int min=sc.nextInt();
		System.out.println("enter max postive integer");
		int max=sc.nextInt();
		int count=0;
		for(int i=min;i<=max;i++) {
			int rem,rev=0,num=i,tem1=i;
			while(num>0){
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(tem1==rev) {
				//System.out.println(tem1);
				if(tem1%2!=0) {
					System.out.println(tem1+" is odd ployndrome");
					count++;
				}
			}
		}
		System.out.println(min+" in beetween range of ployndroime "+max+" "+count);
	}

}
