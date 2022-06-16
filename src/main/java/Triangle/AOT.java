package Triangle;

import java.util.Scanner;

public class AOT {
	long area;
	AOT (long b,long h) //constructor
	{
		area=((b*h)/2);
	}
   }
  class xyz   // another class
  {
	 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    System.out.println("ENTER BASE VALUE :");
	long b=sc.nextLong();
	System.out.println("ENTER HEIGHT VALUE :");
    long h=sc.nextLong();
    AOT a1=new AOT(b,h); // object creation for constructor
    System.out.println("AREA OF TRIANGLE :"+a1.area);
     sc.close();
	  }
}
