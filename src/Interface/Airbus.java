package Interface;

public class Airbus implements Aeroplane{
    @Override
    public void fly() {
        System.out.println("Airbus is flying");
    }

    @Override
    public void taxi() {
        System.out.println("Airbus is flying from IND to US");
    }

    @Override
    public void engine() {
        System.out.println("Engine check is failed");
    }
}
