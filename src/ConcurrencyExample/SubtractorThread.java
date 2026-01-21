package ConcurrencyExample;

import java.util.concurrent.locks.ReentrantLock;

public class SubtractorThread implements Runnable{
   private Count count;


    private ReentrantLock mutex;

    public SubtractorThread(Count count,ReentrantLock mutex)
    {
        this.count=count;
        this.mutex=mutex;
    }

    @Override
    public void run() {
for(int i=1;i<=1000;i++)
{
    mutex.lock();
    count.c=count.c-1;
    mutex.unlock();
}
    }
}
