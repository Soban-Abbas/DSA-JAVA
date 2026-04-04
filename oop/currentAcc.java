package oop;

class currentAcc extends Account {
    currentAcc(){
        super();
    }
    currentAcc(double amount){
        super(amount);
    }
    @Override
    void calculateInterest() {
        System.out.println("Current Account Usually for Bussiness Purpose So No Interest ");
    }
}
