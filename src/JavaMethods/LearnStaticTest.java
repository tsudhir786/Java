package JavaMethods;

public class LearnStaticTest {
	
	static String country;
	
// Setting LearnStaticTest Object with aut(Pakistan)
	public LearnStaticTest() {
//		When the object LearnStaticTest is created we are
//		assigning the value Pakistan
		country = "Pakistan";
	}

	public static void setCountry(String c) {
		country = c;
	}
	
	public void getCountry() {
		System.out.printf("Cuurent Country : %s \n",country);
	}


	public static void main(String[] args) {
		LearnStaticTest c1 = new LearnStaticTest();
		LearnStaticTest c2 = new LearnStaticTest();
		LearnStaticTest c3 = new LearnStaticTest();
		c1.getCountry();
		c2.getCountry();
		c3.getCountry();
		LearnStaticTest.setCountry("USA");
		c1.getCountry();
		c2.getCountry();
		c3.getCountry();
		

	}

}
