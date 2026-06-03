package MiniProjects;

import java.util.Scanner;

public class ATMSimulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double balance = 1000.0;
        while (true) {
        	System.out.println("\n=====ATM MENU=====");
        	System.out.println("1. Check Balance");
        	System.out.println("2. Deposit Balance");
        	System.out.println("3. Withdraw Balance");
        	System.out.println("4. Exit ");
        	
        	System.out.println("Enter your choice");
        	int choice=sc.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("Current Balance: ₹ "+ balance);
        		break;
        		
        	case 2:
        		System.out.println("Enter amount to deposit");
        		double deposit=sc.nextDouble();
        		
        		if(deposit>0) {
        			balance+=deposit;
        			System.out.println("₹"+deposit + "deposited successfully.");
        			System.out.println("Updated Balance: ₹" + balance);
        		} else {
        			System.out.println("Invalid depsoit amount.");
        		}
        		break;
        		
        	case 3:
        		System.out.println("Enter amount to withdrae: ₹ ");
        		double withdraw=sc.nextDouble();
        		
        		if(withdraw<=0) {
        			System.out.println("Invalid withdraw amount :");
        		} else if ( withdraw > balance) {
        			System.out.println("Insufficient balance");
        		} else {
        			balance-=withdraw;
        			System.out.println();
        		}
        	}
        }
	}

}
