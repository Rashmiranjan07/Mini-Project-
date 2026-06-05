package MiniProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber=random.nextInt(100)+1;
        int guess;
        int attempts=0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number 1 and 100");
        
        do {
        	System.out.println("enter you guess: ");
        }
	}

}
