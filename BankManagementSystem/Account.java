class Account {

    protected double balance;
    protected int rateOfInterest;

    Account(double balance, int rateOfInterest) {
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    double getBalance() {
        return balance;
    }

    void addInterest() {
        balance = balance + (balance * rateOfInterest / 100.0);
    }

    void getDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}
