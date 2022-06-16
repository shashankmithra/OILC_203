import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
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
