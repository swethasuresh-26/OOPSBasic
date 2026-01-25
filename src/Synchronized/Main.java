package Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main(String[] args) {
        BankAccount account=new BankAccount();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Depositor depositor=new Depositor(account);
        Withdrawer withdrawer=new Withdrawer(account);

        executorService.submit(depositor);
        executorService.submit(withdrawer);

        try {

            executorService.awaitTermination(3, TimeUnit.SECONDS);
        }catch(Exception e){
            System.out.println(e);
        }
        executorService.shutdown();

        System.out.println("Account Balance: "+account.getBalanace());
    }
}
