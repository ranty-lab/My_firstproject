class Credit extends Account {

    double amount;

    Credit(double balance, int rateOfInterest, double amount) {
        super(balance, rateOfInterest);
        this.amount = amount;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    void addInterest() {
        super.addInterest();
        System.out.println("Interest Added in Credit Account");
    }
}