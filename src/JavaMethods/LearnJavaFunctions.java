package JavaMethods;

import java.util.Scanner;

public class LearnJavaFunctions {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first number :");
		double x = in.nextDouble();
		System.out.println("Enter the Second number :");
		double y = in.nextDouble();
		System.out.println("Enter the Third number :");
		double z = in.nextDouble();
		System.out.println("Smallest value is " + smallest(x, y, z) + "\n");
	}

	public static double smallest(double x, double y, double z) {
		return Math.min((Math.min(x, y)), z);

	}
}
