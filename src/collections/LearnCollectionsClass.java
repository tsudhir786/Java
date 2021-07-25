package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

	public static void main(String[] args) {

//		List<StudentTest> std = new ArrayList<>();
//		
//		std.add(new StudentTest("Sudhir", 1));
//		std.add(new StudentTest("Mom", 2));
//		std.add(new StudentTest("Dad", 3));
//		std.add(new StudentTest("Brother", 4));
//		std.add(new StudentTest("Sister", 5));
//		std.add(new StudentTest("Wife", 6));
//		System.out.println(std);

		List<StudentTest> list = new ArrayList<>();

		list.add(new StudentTest("Anuj", 2));
		list.add(new StudentTest("Ramesh", 4));
		list.add(new StudentTest("Shivam", 3));
		list.add(new StudentTest("Rohit", 1));

		StudentTest s1 = new StudentTest("Anuj", 2);
		StudentTest s2 = new StudentTest("Rohit", 3);

		System.out.println((s1.compareTo(s2)));

		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list, new Comparator<StudentTest>() {

			@Override
			public int compare(StudentTest o1, StudentTest o2) {
				
				return o1.name.compareTo(o2.name);
			}

		});

		System.out.println(list);

//        
//        List<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//
//        System.out.println("min element " + Collections.min(list));
//        System.out.println("max element " + Collections.max(list));
//        System.out.println(Collections.frequency(list, 9));
//
//        Collections.sort(list, Comparator.reverseOrder());
//
//        System.out.println(list);

	}
}
