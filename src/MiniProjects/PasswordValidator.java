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
		if(password.length()<8) {
			System.out.println("❌ Password must be at least 8 characters long.");
			return false;
		}
		boolean hasUpper=false;
		boolean hasLower= false;
		return false;
	}

}

