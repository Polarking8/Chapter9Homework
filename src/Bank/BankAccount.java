package Bank;

/**
 * bank account with name and basic functions
 */
public class BankAccount {
    private String accountName;
    private double balance;

    /**
     * creates an instance of a bank account
     * @param accountName the name of the account
     * @param balance the balance in the account
     */
    public BankAccount(String accountName, double balance){
        this.accountName = accountName;
        this.balance = balance;
    }
    /**
     * removes an amount from the account balance
     * @param amount the amount to be withdrawn
     */
    public void withdraw(double amount){
        balance -= amount;
    }
    /**
     * gets the balance of the account
     * @return returns the balance of the account
     */
    public double getBalance(){
        return balance;
    }

    /**
     * deposits an amount in the bank account
     * @param amount the amount to be deposited
     */
    public void deposit(double amount){
        balance += amount;
    }

    /**
     * gets the account name
     * @return returns the account name
     */
    public String getAccountName(){
        return accountName;
    }
}
