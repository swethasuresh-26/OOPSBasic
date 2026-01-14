package Interface;

public class AirIndia implements Aeroplane,LuggageCarrier{
    @Override
    public void fly() {
        System.out.println("Boeing plane is flying");
    }

    @Override
    public void taxi() {
        System.out.println("Boeing plane is travelling from DBX to IND");
    }

    @Override
    public void engine() {
        System.out.println("Boeing system check is pass");
    }
    public void carryLuggage()
    {
        System.out.println("AirIndia Luggage limit 32Kg");
    }
}
