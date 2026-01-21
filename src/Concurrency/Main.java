package Concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.DoubleToIntFunction;

public class Main {
    static void main(String[] args) {
   /*     HelloWorldPrinter hwp=new HelloWorldPrinter();
        Thread t=new Thread(hwp);
        t.start();
        System.out.println("Hello World : "+Thread.currentThread().getName());
    */
        /*
        ExecutorService executorService= Executors.newFixedThreadPool(25);
        Instant start=Instant.now();

        for(int i=1;i<=100;i++)
        {
            if(i==5 || i==45 ||i==90)
                System.out.println("Debug");
            NumberPrinter n=new NumberPrinter(i);
          // Thread t=new Thread(n);
            //t.start();

            executorService.submit(n);
            }*/
       /* Instant end=Instant.now();
        Duration duration=Duration.between(start,end);
        System.out.println(duration.toMillis());*/
   DeliveryChargeCalculator deliveryChargeCalculator = new DeliveryChargeCalculator();
   DiscountCalculator discountCalculator=new DiscountCalculator();
   TaxCalculator taxCalculator=new TaxCalculator();

   ExecutorService executorService=Executors.newFixedThreadPool(3);
   Future<Integer> deliveryChargeFuture=executorService.submit(deliveryChargeCalculator);
   Future<Integer> discountFuture=executorService.submit(discountCalculator);
   Future<Integer> taxFuture=executorService.submit(taxCalculator);

        System.out.println("Start Billing");
try {
    //Get call on future is blocking call
    int deliveryCharge = deliveryChargeFuture.get();
    int discount = discountFuture.get();
    int tax = taxFuture.get();
    int total=deliveryCharge+tax-discount;
    System.out.println("Total Cost: "+total);
}
catch (Exception e)
{
    System.out.println(e);
}

    }
}
//Thread start from zero in normal thread
//In executor Service it start from 1
//WorkQueue==Number of tasks we want to execute
//Workers = Number of Threads in Thread Pool