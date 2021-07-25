package JavaMethods;

import java.util.Scanner;

public class TestPasswordValidation {
	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits\n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): \n");
		String input = in.nextLine();
		// if(! means , if not true)
		if (is_Valid_Password(input)) {
			System.out.println("Password is valid : " + input);
		} else
			System.out.println("Not a valid password : " + input);
	}

	public static boolean is_Valid_Password(String password) {
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (is_Numeric(ch))
				numCount++;
			else if (is_Letter(ch))
				charCount++;
			else
				return false;

		}
		return (charCount >= 2 && numCount >= 2);

	}

	public static boolean is_Numeric(char ch) {
		boolean value = (ch >= '0' && ch <= '9');
		return value;
	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		boolean value = (ch >= 'A' && ch <= 'Z');
		return value;
	}
}
