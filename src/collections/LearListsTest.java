package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearListsTest {

	public static void main(String[] args) {

		/*
		 * String [] studentsName = new String[6]; studentsName[0] = "Sudhir";
		 * studentsName[1] = "Shyam"; studentsName[2] = "Sirisha"; studentsName[4] =
		 * "Swathi"; studentsName[5] = "1"; studentsName[6] = "Some X";
		 * 
		 * 
		 * 
		 * for (String string : studentsName) { System.out.println("studentsName is "+
		 * string );
		 * 
		 * }
		 */

		List<String> studentsName = new ArrayList<>();
//		The below also can be used.
//		List<String> studentsName = new LinkedList<>();
		
		studentsName.add(0, "Doubtful Student");
		studentsName.add(1, "Swati");
		studentsName.add(2, "Shyam");
		studentsName.add(3, "Sudhir");
//		System.out.println(studentsName);
		studentsName.add("Bhanu");
//		System.out.println(studentsName);

		ArrayList<String> newStudentsjoined = new ArrayList<>();
		newStudentsjoined.add("Prasanna");
		newStudentsjoined.add("Bhanu Thota");

		System.out.println("New Students Joined " + newStudentsjoined);
		studentsName.addAll(newStudentsjoined);
		System.out.println("All Students " + studentsName);

		System.out.println(studentsName.contains(newStudentsjoined.get(0)));
		System.out.println(studentsName.toString());

		System.out.println(studentsName.remove(String.valueOf("Doubtful Student")));
//		System.out.println(studentsName);
		studentsName.set(3, "Sudhir Hero");
		/*
		 * for (int i = 0; i <= studentsName.size(); i++) {
		 * 
		 * System.out.println(studentsName.remove(i)); System.out.println(studentsName);
		 * 
		 * }
		 */

//		System.out.println(studentsName);
//		studentsName.clear();
//		System.out.println(studentsName);

		// For each loop
		for (Object name : studentsName) {
			System.out.println("printing name " + name);

		}

		Iterator<String> it = studentsName.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);

		}

	}
}
