package ConcurrencyExample;

public class Main {
    static void main(String[] args) {
        Count count=new Count();
        AdderThread add=new AdderThread(count);
        SubtractorThread sub=new SubtractorThread(count);

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
