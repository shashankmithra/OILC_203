package flowcontrols;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER NUMBER :");
		int number=sc.nextInt();
		if(number%2==0) 
			System.out.println("even number :");
		else
			System.out.println("not even number :");
		sc.close();
	
 


}

}
