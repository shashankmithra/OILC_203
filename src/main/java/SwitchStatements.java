import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("     Switch Application     ");
		System.out.println("|         1.Add            |");
		System.out.println("|         2.Sub            |");
		System.out.println("|         3.Mul            |");
		System.out.println("|         4.Div            |");
		System.out.println("----------------------------");
		System.out.println("     ENTER YOUR CHOICS ?");
		int choice = sc.nextInt();
		System.out.println("Enter A value ?");
		int a = sc.nextInt();
		System.out.println("Enter B value ?");
		int b = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Result =" + (a + b));
			break;
		case 2:
			System.out.println("Result =" + (a - b));
			break;
		case 3:
			System.out.println("Result =" + (a * b));
			break;
		case 4:
			System.out.println("Result =" + (a / b));
			break;
		default:
			System.out.println("Please select your choice b/w 1-4 only");
		}
	}

}
