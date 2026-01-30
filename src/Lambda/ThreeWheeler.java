package Lambda;

public class ThreeWheeler implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting ThreeWheeler");
    }

    @Override
    public void run() {
        System.out.println("Running ThreeWheeler");
    }

    @Override
    public void brake() {
        System.out.println("Braking ThreeWheeler");
    }
}
