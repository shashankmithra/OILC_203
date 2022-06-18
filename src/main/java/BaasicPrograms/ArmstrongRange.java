package BaasicPrograms;

import java.util.Scanner;

public class ArmstrongRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int min=sc.nextInt();
		System.out.println("enter max postive integer");
		int max=sc.nextInt();
		for(int i=min;i<=max;i++) {
			int rem,arm=0,num=i,tem1=i;
			while(num>0) {
				rem=num%10;
				num=num/10;
				arm=arm+(rem*rem*rem);
				
			}
			if(tem1==arm) {
				System.out.println(tem1);
				sc.close();
			}
		}
	}

}
