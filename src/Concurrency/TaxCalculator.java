package Concurrency;

import java.util.Random;
import java.util.concurrent.Callable;

public class TaxCalculator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random=new Random();
        Integer number=random.nextInt(100);
        return number;
    }
}
