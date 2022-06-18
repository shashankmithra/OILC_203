package Assignment_1;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {

	static double calculateAge(int birthYear, int birthMonth) {
		Calendar cal = Calendar.getInstance();

		double year = cal.get(Calendar.YEAR);
		double month = cal.get(Calendar.MONTH);
		if (birthMonth < 1 || birthYear < 1) {
			return -1;

		}
		if (birthYear >= 2022) {
			return -2;
		} else {
			double age = ((year - birthYear) + ((month - birthMonth) / 12));
			return age;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the your birth year");
		int birthYear = sc.nextInt();
		System.out.println("enter the your birth month");
		int birthMonth = sc.nextInt();
		System.out.printf(" your age is : " + "%.2f", calculateAge(birthYear, birthMonth));
		sc.close();

	}

}
