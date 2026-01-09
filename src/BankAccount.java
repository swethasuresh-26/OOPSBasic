public class BankAccount {
    String accountNumber;
    int accountBalance;
    String accountHolder;

    int getAccountBalance()
    {
        return accountBalance;
    }

    String getAccountNumber()
    {
        return accountNumber;
    }

    String getAccountHolder()
    {
        return accountHolder;
    }

    boolean isAccountBalMin()
    {
        if(getAccountBalance()<1000)
            return true;
        else
            return false;
    }
}
