package Task_1;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("CD123456789", "BEKA TCHITADZE");

        account.deposit(700);
        account.withdraw(200);

        double currencyBalance = account.getBalance();
        if (currencyBalance == 500) {
            System.out.println("სწორად იმუშავა, არსებული ბალანსი არის: " + currencyBalance);
        }else {
            System.out.println("სწორად არ იმუშავა, არსებული ბალანსი არის: " + currencyBalance);
        }
    }
}
