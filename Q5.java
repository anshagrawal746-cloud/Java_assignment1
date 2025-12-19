package Assignment1;

import java.util.Scanner;

//Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String msg) {
     super(msg);
 }
}

class BankAccount {
 private int accNo;
 private String name;
 private double balance;

 // Constructor
 BankAccount(int accNo, String name, double balance) {
     this.accNo = accNo;
     this.name = name;
     this.balance = balance;
 }

 // Deposit Method
 void deposit(double amount) throws IllegalArgumentException {
     if (amount <= 0)
         throw new IllegalArgumentException("Invalid deposit amount");
     balance += amount;
     System.out.println("Amount Deposited Successfully");
 }

 // Withdraw Method
 void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance)
         throw new InsufficientBalanceException("Insufficient Balance");
     balance -= amount;
     System.out.println("Amount Withdrawn Successfully");
 }

 // Balance Enquiry
 void checkBalance() {
     System.out.println("Current Balance: " + balance);
 }

 // Display Account Details
 void display() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Account No: " + accNo);
     System.out.println("Name: " + name);
     System.out.println("Balance: " + balance);
 }
}

public class Q5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accNo = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Account Holder Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Initial Balance: ");
	        double balance = sc.nextDouble();

	        BankAccount acc = new BankAccount(accNo, name, balance);

	        int choice;
	        do {
	            System.out.println("\n--- BANK MENU ---");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Balance Enquiry");
	            System.out.println("4. Display Account Details");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            try {
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter deposit amount: ");
	                        acc.deposit(sc.nextDouble());
	                        break;

	                    case 2:
	                        System.out.print("Enter withdrawal amount: ");
	                        acc.withdraw(sc.nextDouble());
	                        break;

	                    case 3:
	                        acc.checkBalance();
	                        break;

	                    case 4:
	                        acc.display();
	                        break;

	                    case 5:
	                        System.out.println("Thank you for using Bank System");
	                        break;

	                    default:
	                        System.out.println("Invalid choice");
	                }
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }

	        } while (choice != 5);
	        sc.close();
	    }
	 
}
