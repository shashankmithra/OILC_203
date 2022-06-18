package BaasicPrograms;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		int f1 = 0, f2 = 1, f3;
		// System.out.print(f1+" "+f2+" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a starting range");
		int num = sc.nextInt();
		System.out.println("enter a end range");
		int num1 = sc.nextInt();
		System.out.print(f1 + " ");

		for (int i = num; i <= num1; i++) {
			f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;
			sc.close();

		}

	}

}
