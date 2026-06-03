package MiniProjects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.print("Enter Operator (+, -, *, /, % && x to exit): ");
			char op = in.next().trim().charAt(0);

			if (op == 'x' || op == 'X') {
				System.out.println("Calculator Closed.");
				break;
			}

			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

				System.out.print("Enter First Number: ");
				int num1 = in.nextInt();

				System.out.print("Enter Second Number: ");
				int num2 = in.nextInt();

				int ans = 0;

				switch (op) {

				case '+':
					ans = num1 + num2;
					break;

				case '-':
					ans = num1 - num2;
					break;

				case '*':
					ans = num1 * num2;
					break;

				case '/':
					if (num2 != 0) {
						ans = num1 / num2;
					} else {
						System.out.println("Error: Cannot divide by zero.");
						continue;
					}
					break;

				case '%':
					if (num2 != 0) {
						ans = num1 % num2;
					} else {
						System.out.println("Error: Cannot perform modulus by zero.");
						continue;
					}
					break;
				}

				System.out.println("Answer = " + ans);

			} else {
				System.out.println("Invalid Operator! Please try again.");
			}
		}

	}
}