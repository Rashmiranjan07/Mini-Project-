package MiniProjects;

import java.util.Scanner;

public class StudentGradeGenerator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== STUDENT GRADE MANAGEMENT SYSTEM =====");

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Roll Number: ");
		int rollNo = sc.nextInt();

		int[] marks = new int[5];
		int total = 0;

		System.out.println("\nEnter Marks of 5 Subjects:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = sc.nextInt();
			total += marks[i];
		}

		double percentage = total / 5.0;

		String grade;

		if (percentage >= 90) {
			grade = "A+";
		} else if (percentage >= 80) {
			grade = "A";
		} else if (percentage >= 70) {
			grade = "B";
		} else if (percentage >= 60) {
			grade = "C";
		} else if (percentage >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("\n========== REPORT CARD ==========");
		System.out.println("Student Name : " + name);
		System.out.println("Roll Number  : " + rollNo);
		System.out.println("Total Marks  : " + total + "/500");
		System.out.println("Percentage   : " + percentage + "%");
		System.out.println("Grade        : " + grade);
		System.out.println("=================================");


	}
}
