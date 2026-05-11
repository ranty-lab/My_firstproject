public class Main {

    public static void main(String[] args) {

        Saving s = new Saving(1000, 5);

        s.deposit(1000);
        s.withdraw(300);
        s.addInterest();
        s.getDetails();

        System.out.println();

        Credit c = new Credit(2000, 10, 500);

        c.deposit(500);
        c.withdraw(400);
        c.addInterest();
        c.getDetails();
    }
}