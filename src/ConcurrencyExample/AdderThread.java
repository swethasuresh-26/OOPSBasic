package ConcurrencyExample;

import java.util.concurrent.locks.ReentrantLock;

public class AdderThread implements Runnable{

    private Count count;
    private ReentrantLock mutex;

    public AdderThread(Count count,ReentrantLock mutex)
    {
        this.count=count;
        this.mutex=mutex;
    }
    @Override
    public void run() {

       for(int i=1;i<=1000;i++)
       {
           mutex.lock();
           count.c=count.c+1;
            mutex.unlock();
       }
    }
}
