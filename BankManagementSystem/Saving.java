class Saving extends Account {

    Saving(double balance, int rateOfInterest) {
        super(balance, rateOfInterest);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    void addInterest() {
        super.addInterest();
        System.out.println("Interest Added in Saving Account");
    }
}