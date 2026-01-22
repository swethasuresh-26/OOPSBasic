package Synchronized;

import java.util.concurrent.Callable;

public class Depositor implements Runnable{

    private BankAccount account;

    public Depositor(BankAccount account)
    {
        this.account=account;
    }
    @Override
    public void run() {

        for(int i=0;i<100;i++)
        {
            account.deposit((long)i);
        }
    }
}
