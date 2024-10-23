package Task_4.Problem3;

public class BankAccount {
    private long accNumber;
    private float balance;

    BankAccount(long accNumber, float balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void accDetails(float balance){
        System.out.println("Account Number: " +accNumber);
        System.out.println("*******************");
        System.out.println("Initial Amount is: " +balance);
    }

    public void checkBalance(float balance, float amount, char transaction) {
        System.out.println("After" + (transaction == 'd' ? " Depositing " : " Withdrawing ") +amount+ ", Total amount is: " +balance);
        System.out.println();
    }

    public void setDeposit(float amount) {
        accDetails(balance);
        balance += amount;
        checkBalance(balance, amount, 'd');
    }

    public void withdrawAmount(float amount) {
        accDetails(balance);
        balance -= amount;
        checkBalance(balance, amount, 'w');

    }


}
