package MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        String characterSet = "";

        System.out.println("=== Password Generator ===");

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characterSet += upperCase;
        }

        System.out.print("Include lowercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characterSet += lowerCase;
        }

        System.out.print("Include numbers? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characterSet += numbers;
        }

        System.out.print("Include special characters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characterSet += specialChars;
        }

        if (characterSet.isEmpty()) {
            System.out.println("Error: No character type selected!");
            return;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }

        System.out.println("\nGenerated Password: " + password);
        
   
    }
}