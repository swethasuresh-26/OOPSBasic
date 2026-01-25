package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;
    private int maxSize;
    private String name;
    private Semaphore semaphoreProducer;
    private Semaphore semaphoreConsumer;

    public Consumer(Queue<Shirt> store, int maxSize, String name, Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.semaphoreProducer = semaphoreProducer;
        this.semaphoreConsumer = semaphoreConsumer;
    }

    public Consumer(Queue<Shirt> store, int maxSize, String name){

        this.store=store;
        this.maxSize=maxSize;
        this.name=name;
    }
    @Override
    public void run() {

        while(true)
        {
            System.out.println("Shirt consumed by consumer : "+name);
//            if(store.size()>0)
//            {
//                store.remove();
//            }
            try {
                semaphoreConsumer.acquire();
                store.remove();
                semaphoreProducer.release();
            }catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            System.out.println("Store Size : "+store.size());

        }
    }
}
