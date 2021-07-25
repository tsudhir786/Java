package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class LearnArraysClass {

	public static void main(String[] args) {

		Integer numbers[] = { 10, 5, 4, 90, 56, 32 };
		Arrays.sort(numbers);
//		System.out.println(numbers.toString());
//		Arrays.fill(numbers,100);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}

		for (Integer number : numbers) {
			System.out.println(number);
			
		}
	}

}
