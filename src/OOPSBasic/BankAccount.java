public class BankAccount {
    String accountNumber;
    int accountBalance;
    String accountHolder;

    public  BankAccount()
    {

    }
    public BankAccount(String accountNumber,int accountBalance,String accountHolder)
    {
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.accountHolder=accountHolder;
        //Default constructor
    }
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

    void printDetails()
    {
        System.out.println(this.accountHolder+" "+this.accountNumber+" "+this.accountBalance);
    }
}


