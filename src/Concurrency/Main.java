package Concurrency;

public class Main {
    static void main(String[] args) {
        HelloWorldPrinter hwp=new HelloWorldPrinter();
        Thread t=new Thread(hwp);
        t.start();
        System.out.println("Hello World : "+Thread.currentThread().getName());
    }
}
