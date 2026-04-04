package oop;

class savingAcc extends Account {

    private int TimeInYear = 1;
    private int interestRate = 5;
    private double balanceInAccount = super.getBalance();
    private double Interest;

    savingAcc() {
        super();
    }

    savingAcc(double amount) {
        super(amount);
    }

    @Override
    void calculateInterest() {
        this.Interest = (double) (balanceInAccount * interestRate * TimeInYear) / 100;
        System.out.println("Interest On Maintaining Current Balace for 1 year :" + Interest);
    }

}
