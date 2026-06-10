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

	private static boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
