package Concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main(String[] args) {
   /*     HelloWorldPrinter hwp=new HelloWorldPrinter();
        Thread t=new Thread(hwp);
        t.start();
        System.out.println("Hello World : "+Thread.currentThread().getName());
    */

        ExecutorService executorService= Executors.newFixedThreadPool(25);
        Instant start=Instant.now();

        for(int i=1;i<=100;i++)
        {
            if(i==5 || i==45 ||i==90)
                System.out.println("Debug");
            NumberPrinter n=new NumberPrinter(i);
          /* Thread t=new Thread(n);
            t.start();
            * */
            executorService.submit(n);
            }
       // Instant end=Instant.now();
        //Duration duration=Duration.between(start,end);
        //System.out.println(duration.toMillis());
    }
}
//Thread start from zero in normal thread
//In executor Service it start from 1
//WorkQueue==Number of tasks we want to execute
//Workers = Number of Threads in Thread Pool