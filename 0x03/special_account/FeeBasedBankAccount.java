import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        balance -= 0.10;
        transactionCount++;
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        balance -= 0.10;
        transactionCount++;
    }
}
