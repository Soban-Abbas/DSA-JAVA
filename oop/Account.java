package oop;

abstract class Account {
    static String BankName="HBL";
    private final double accountNumber;
    private double balance;

    Account() {
        this(0);
    }

    Account(double amount) {
        this.balance = amount;
        this.accountNumber = Math.random();
        System.out.println("Account Successfully Created ");
    }

    abstract void calculateInterest();

    void getAccountNumber(){
        System.out.println("Account Number : " + this.accountNumber);
    }

    double getBalance() {
        return this.balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Amount Cradited Successfully");
        } else {
            System.out.println(" Failed : Invalid Amount");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Amount Cradited Successfully");
        } else {
            System.out.println(" Failed : Invalid Amount");
        }
    }

    void withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance=this.balance-amount;
        }else{
            System.out.println("Failed :Invalid Amount ");
        }
    }


    static void AccountInfo(){
        System.out.println("Your Account is Associated with HBL");
        System.out.println( "No illegal activity allowed");
    }

}
