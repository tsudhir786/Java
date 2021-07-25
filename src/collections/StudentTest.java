package collections;

public class StudentTest implements Comparable<StudentTest> {
// when Comparable is implemented its CompareTo method can be used to compare  once/one type. 
	String name;
	int rollnumber;
	int joiningYear;

	public StudentTest(String name, int rollnumber, int joiningYear) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.joiningYear = joiningYear;
	}

	public StudentTest(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;

	}

	@Override
	public String toString() {
		return "StudentTest [name=" + name + ", rollnumber=" + rollnumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollnumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentTest other = (StudentTest) obj;
		if (rollnumber != other.rollnumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(StudentTest that) {
		return this.rollnumber - that.rollnumber;
	}

}
