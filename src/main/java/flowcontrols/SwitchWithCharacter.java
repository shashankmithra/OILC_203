package flowcontrols;

import java.util.Scanner;

public class SwitchWithCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("     Switch Application     ");
		System.out.println("|         a.Add            |");
		System.out.println("|         b.Sub            |");
		System.out.println("|         c.Mul            |");
		System.out.println("|         d.Div            |");
		System.out.println("----------------------------");
		System.out.println("     ENTER YOUR CHOICS ?");
		int choice = sc.next().charAt(0);
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		switch (choice) {
		case 'a':
			System.out.println("Result =" + (a + b));
			break;
		case 'b':
			System.out.println("Result =" + (a - b));
			break;
		case 'c':
			System.out.println("Result =" + (a * b));
			break;
		case 'd':
			System.out.println("Result =" + (a / b));
			break;
		default:
			System.out.println("Please select your choice b/w a-d only");
			sc.close();
		}
	}}