package ConcurrencyExample;

public class SubtractorThread implements Runnable{
   private Count count;

   public SubtractorThread(Count count)
   {
        this.count=count;
   }
    @Override
    public void run() {
for(int i=1;i<=1000;i++)
{
    count.c=count.c-1;
}
    }
}
