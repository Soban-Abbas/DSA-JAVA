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

        if (accountType == 1) {
            if (amount > 0) {
                customer cust = new customer(name, new savingAcc(amount));
            } else {
                customer cust = new customer(name, new savingAcc());
            }

        }

        else if (accountType == 2) {
            if (amount > 0) {
                customer cust = new customer(name, new currentAcc(amount));
            } else {
                customer cust = new customer(name, new currentAcc());
            }

        }
    }

    public static void main(String[] args) {

       main.createAccount();

    }
}
