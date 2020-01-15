package assignment505;

public class Account {

    static int numOfAccounts = 0;
    int id;
    double balance;
    double annualInterestRate;

    public Account() {

        this.balance = 0;
        id = numOfAccounts;
    }

    public Account(int id, double balance, double annualInterestRate) {

        if (balance < 0) {
            this.balance = 0;
        } else {

            this.balance = balance;
        }
        this.annualInterestRate = annualInterestRate;
        this.id = id;
        numOfAccounts++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return balance * (annualInterestRate / 100);
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (balance * (annualInterestRate / 100)) / 12;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            balance = balance - 0;
        } else {
            balance = balance - amount;
        }
    }

    public void deposit(double amount) {
        if (amount < 0) {
            balance = balance + 0;
        } else {
            balance = balance + amount;
        }

    }

    public static int getNumberOfAccounts() {
        return numOfAccounts;
    }

    public void transfer(double amount, Account newAcc) {

        this.withdraw(amount);
        newAcc.deposit(amount);
    }

    public void displayBalance() {

        System.out.println("\nAcc No: " + getId());
        System.out.printf("Balance: $%.2f\n", getBalance());
        System.out.printf("Annual Interest: $%.2f\n", getAnnualInterestRate());
        System.out.printf("Monthly Interest: $%.2f\n", getMonthlyInterestRate());

    }
}
