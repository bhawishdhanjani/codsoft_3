package com.codsofttask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserBankAccount userBankAccount = new UserBankAccount(20000);
        ATM atm = new ATMMachine(userBankAccount);
        boolean run = true;
        while (run){
            System.out.println("Welcome Select operation you want to perform");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("Any Other Number Will Quit the Application");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Amount Want to Withdraw");
                    int amount = scanner.nextInt();
                    System.out.println(atm.withdraw(amount));
                }
                case 2 -> {
                    System.out.println("Enter Amount Want to Deposit");
                    int amount = scanner.nextInt();
                    System.out.println(atm.deposit(amount));
                }
                case 3 -> System.out.println(atm.checkBalance());
                default -> run = false;
            }

        }
    }
}
