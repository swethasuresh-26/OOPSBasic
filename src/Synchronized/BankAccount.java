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
    public void deposit(Long amount){
        if(amount>=0)
            this.balance+=amount;
    }
    public void withdraw(Long amount){
        if(amount>0 && this.balance>amount)
            this.balance-=amount;
    }
}
