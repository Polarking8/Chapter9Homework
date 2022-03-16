package Bank;

public class BasicAccount extends BankAccount{
    /**
     * creates an instance of a bank account
     *
     * @param accountName the name of the account
     * @param balance     the balance in the account
     */
    public BasicAccount(String accountName, double balance) {
        super(accountName, balance);
    }
    /**
     * removes an amount from the acc balance if it will not make it negative
     * @param amount the amount to be withdrawn
     */
    @Override
    public void withdraw(double amount) {
        if(getBalance()-amount > 0){
            super.withdraw(amount);
        }
    }
}
