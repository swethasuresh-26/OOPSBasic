package Synchronized;

public class Withdrawer implements Runnable{

    private BankAccount account;
    public Withdrawer(BankAccount account)
    {
        this.account=account;
    }

    @Override
    public void run() {
        for(int j=0;j<100;j++)
            account.withdraw((long)j);
    }
}
