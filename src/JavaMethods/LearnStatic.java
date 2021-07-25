package JavaMethods;

public class LearnStatic {

	static String country;

	LearnStatic() {
		country = "Pakistan";
	}
	
	LearnStatic(int rank , String country){
		
	}

	public static void setCountry(String c) {
		country = c;
	}

	public void getCountry() {
		System.out.printf("Current country: %s \n", country);
	}

	public static void main(String args[]) {
		LearnStatic c1 = new LearnStatic();
		LearnStatic c2 = new LearnStatic();
		LearnStatic c3 = new LearnStatic();
		LearnStatic c4 = new LearnStatic(1, "Palistan");
		
		
		c1.getCountry();
		c2.getCountry();
		c3.getCountry();
		LearnStatic.setCountry("USA");
		c1.getCountry();
		c2.getCountry();
		c3.getCountry();
	}
}
