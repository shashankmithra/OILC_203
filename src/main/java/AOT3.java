import java.util.Scanner;

public class AOT3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner (System.in);
		System.out.println("ENTER HEIGHT OF TRIANGLE :");
		int a=s1.nextInt();
		System.out.println("ENTER BASE OF TRIANGLE :");
		int b =s1.nextInt();
		System.out.println("ENTER BASE OF TRIANGLE :");
		int c =s1.nextInt();
		if((a+b)>c &&(a+c)>b && (b+c)>a)
		{
			int s=(a+b+c)/2;
		   double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("AREA OF TRIANGLE :"+area);
		}
		else
		{
		System.out.println("AREA OF TRIANGLE NOT EXIT");
		s1.close();
		}

	}

}
