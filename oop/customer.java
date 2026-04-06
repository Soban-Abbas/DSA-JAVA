package oop;

public class customer {
    private String CustomerName;
    private Account account;
    customer(String customerName,Account account){
        this.CustomerName=customerName;
        this.account=account;
    }

    void getCustomerName(){
        System.out.println("Customer Name :" + CustomerName);;

    }
    void setCustomerName(String customerName){
        this.CustomerName=customerName;

    }
    Account getCustomerAccount(){
        System.out.println("Account Type :" + account.getClass().getSimpleName());
        return account;
    }
    void setCustomerAccount(Account account){
        this.account=account;
       // System.out.println("Account type is changed");
    }
}
