package ConcurrencyExample;

public class AdderThread implements Runnable{

    private Count count;

    public AdderThread(Count count)
    {
        this.count=count;
    }
    @Override
    public void run() {
       for(int i=1;i<=1000;i++)
       {
           count.c=count.c+1;
       }
    }
}
