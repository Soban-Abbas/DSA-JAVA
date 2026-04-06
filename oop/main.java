package oop;

import java.util.Scanner;

public class main {

    static void createAccount() {
        System.out.println("Create Your Account");
        System.out.print("Enter Your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Enter Account Choice");
        System.out.println("1 : Saving ");
        System.out.println("2 : Current ");
        System.out.print("lets Enter :");
        int accountType = sc.nextInt();
        System.out.print("Enter Amount want to deposit :");
        double amount = sc.nextInt();
        customer cust;
        if (accountType == 1) {

            if (amount > 0) {
                cust = new customer(name, new savingAcc(amount));
                getDetails(cust);
            } else {
                cust = new customer(name, new savingAcc());
                getDetails(cust);
            }

        }

        else if (accountType == 2) {
            if (amount > 0) {
                cust = new customer(name, new currentAcc(amount));
                getDetails(cust);
            } else {
                cust = new customer(name, new currentAcc());
                getDetails(cust);
            }

        }

    }

    static void getDetails(customer cust) {
        Scanner sc = new Scanner(System.in);
        Account userAccount = cust.getCustomerAccount();
        while (true) {
            System.out.println("------------Menu---------");

            System.out.println("1: Check Your Account Number ");
            System.out.println("2: Check Account Holder Name");
            System.out.println("3: check Your Balance ");
            System.out.println("4: Deposit Amount");

            System.out.println("5: Check Account Type");
            System.out.println("6: Change Account Type : ");
            System.out.println("7: Calculate Interest Rate");
            System.out.println("8: More Info");
            System.out.println("9: Exit");

            int Choice = sc.nextInt();
            if (Choice == 1) {
                userAccount.getAccountNumber();
            } else if (Choice == 2) {
                cust.getCustomerName();
            } else if (Choice == 3) {
                System.out.println(userAccount.getBalance());
            } else if (Choice == 4) {
                System.out.print("Enter Deposit Amount : ");
                int amount = sc.nextInt();
                userAccount.deposit(amount);
                System.out.print("New Balance : " + userAccount.getBalance());

            } else if (Choice == 5) {
                cust.getCustomerAccount();
            } else if (Choice == 6) {
                 double balance= userAccount.getBalance();

                if (userAccount instanceof savingAcc) {
                  
                    cust.setCustomerAccount(new currentAcc(balance));
                    System.out.println("Account Type Changed form Saving Account to current Account");

                } else {
                    cust.setCustomerAccount(new savingAcc(balance));
                    System.out.println("Account Type Chnage from Current Account to Saving Account");
                }

            } else if (Choice == 7) {
                userAccount.calculateInterest();
            } else if (Choice == 8) {
                Account.AccountInfo();
            } else if (Choice == 9) {
                break;
            } else {
                System.out.println("Enter Valid Operation");
            }

        }

        // int Choice=sc.nextInt();
        // Account customerAccount=cust.getCustomerAccount();

    }

    public static void main(String[] args) {

        main.createAccount();

    }
}
