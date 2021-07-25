package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Doesn't include duplicate elements

public class LearnSetTest extends StudentTest {

	public LearnSetTest(String name, int rollnumber) {
		super(name, rollnumber);

	}

	public static void main(String[] args) {

		/*
		 * Set<Student> studentSet = new HashSet<>(); studentSet.add(new
		 * Student("Swathi", 100)); studentSet.add(new Student("Sudhir", 101));
		 * studentSet.add(new Student("Bhanu", 102)); studentSet.add(new
		 * Student("Thota Bhanu", 103));
		 */

		Set<StudentTest> set = new HashSet<>();
		set.add(new StudentTest("Sudhir", 1));
		set.add(new StudentTest("Swathi", 2));
		set.add(new StudentTest("Sudhir", 2));
		set.add(new StudentTest("MySon", 3, 2022));
		
		System.out.println(set);
		
		StudentTest s1 = new StudentTest("Nanaji", 1);
		StudentTest s2 = new StudentTest("Satya", 1);
		System.out.println(s1.equals(s2));


		/*
		 * Set<String> set = new HashSet<>(); set.add("Sudhir"); set.add("Swathi");
		 * System.out.println(set); System.out.println(set.contains("Sudhir"));
		 */
//		Set<Integer> set = new HashSet<>();
//		Linked HashSet maintains order

//		Set<Integer> set = new LinkedHashSet<>();
//		Tree set same as set such as unique but sorted
//		Set<Integer> set = new TreeSet<>();
//		set.add(32);
//		set.add(2);
//		set.add(54);
//		set.add(21);
//		set.add(65);
//The order is set based on hashing
//		System.out.println(set);
//
//		set.remove(54);
//
//		System.out.println(set);
//
//		System.out.println(set.contains(21));
//
//		System.out.println(set.isEmpty());
//
//		System.out.println(set.size());
//
//		set.clear();
//
//		System.out.println(set);

	}

}
