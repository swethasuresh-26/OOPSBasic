package Synchronized;

public class BankAccount {
    private Long balance=0L;

    public Long getBalanace(){
        return balance;
    }
    public void setBalance(Long balance)
    {

            this.balance=balance;
    }
    public synchronized void deposit(Long amount){
        if(amount>=0)
            this.balance+=amount;
    }
    public synchronized void withdrawWithMethod(Long amount){
        if(amount>0 && this.balance>=amount)
            this.balance-=amount;
    }
    public  void withdrawWithBlock(Long amount){
        if(amount>0 && this.balance>=amount)
        {
            synchronized (this){
                this.balance-=amount;
            }
        }
    }

}
//Sync With Method blocks the entire Method
//Sync with Block blocks only a particular Part