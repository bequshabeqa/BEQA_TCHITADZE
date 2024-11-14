package Task_1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountHolderName = accountHolderName;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("თანხა უნდა იყოს 0-ზე მეტი ");
        }
    }
    public void withdraw(double amount) {
        if (amount >0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("ანგარიშზე არ არის საკმარისი თანხა! ");
        }
    }
    public double getBalance() {
        return balance;
    }
}
