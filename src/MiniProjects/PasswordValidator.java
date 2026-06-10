package MiniProjects;

import java.util.Scanner;

public class PasswordValidator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = sc.nextLine();

		if (isValidPassword(password)) {
			System.out.println("✅ Strong Password");
		} else {
			System.out.println("❌ Weak Password");
		}
	}

	public static boolean isValidPassword(String password) {
		if (password.length() < 8) {
			System.out.println("❌ Password must be at least 8 characters long.");
			return false;
		}
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch))
				hasUpper = true;
			else if (Character.isLowerCase(ch))
				hasLower = true;
			else if (Character.isDigit(ch))
				hasDigit = true;
			else
				hasSpecial = true;

		}

		if (!hasUpper) {
			System.out.println("❌ Password must contain at least one uppercase letter.");
			return false;
		}
		if (!hasLower) {
			System.out.println("❌ Password must contain at least one lowercase letter.");
			return false;
		}

		if (!hasDigit) {
			System.out.println("❌ Password must contain at least one Digit.");
			return false;
		}
		if (!hasSpecial) {
			System.out.println("❌ Password must contain at least one special character.");
			return false;
		}
		return true;
	}

}
