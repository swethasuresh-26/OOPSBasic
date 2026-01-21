package ConcurrencyExample;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static void main(String[] args) {
        Count count=new Count();

        //We are using the same mutex Object for both the threads
        ReentrantLock mutex=new ReentrantLock();

        AdderThread add=new AdderThread(count,mutex);
        SubtractorThread sub=new SubtractorThread(count,mutex);

        Thread t1=new Thread(add);
        Thread t2=new Thread(sub);

        t1.start();
        t2.start();

try {
    t1.join();//Main thread will wait until t1 complete
    t2.join();//Main thread will wait until t2 complete
}catch(InterruptedException e)
{
    System.out.println(e);
}
        System.out.println("Final Count Value : "+count.c);
    }
}
