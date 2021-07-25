package javaforloops;

import java.util.Scanner;

public class LearnJavaForLoops {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		int number2 = input.nextInt();

		/*
		 * tenNumbers(number); sumOfNaturals(number); tables(number);
		 */
//		factorial(number);
		exponential(number, number2);
	}

	public static void tenNumbers(int j) {

		for (int i = 1; i <= j; i++) {
			System.out.println("The numbers are " + i);

		}

	}

	public static void sumOfNaturals(int j) {
		int sum = 0;
		for (int i = 1; i <= j; i++) {

			sum += i;
//			sum = sum + i;
//			sum = +i;
//			sum = i;

		}
		System.out.println(sum);
	}

	public static void tables(int tableNumber) {

		for (int i = 1; i <= 10; i++) {
			int tableValue = tableNumber * i;
			System.out.println(tableNumber + " X " + i + " = " + tableValue);
		}

	}

	public static void factorial(int number) {

		int fact = 1; // To hold factorial

		for (int i = 1; i <= number; i++) {
			fact *= i;
		}

		System.out.println("Factorial: " + fact);
	}

	public static void exponential(int number, int number2) {

		int j = 1;
		for (int i = 1; i <= number2; i++) {

			number *= j;

		}

	}

}
