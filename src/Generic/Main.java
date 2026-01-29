package Generic;

public class Main {
    static void main(String[] args) {
        Pair<Integer,String> pairIdName=new Pair<>();
        pairIdName.print(10,"Dhruv");

        Pair<Integer,Boolean> intBoolPair=new Pair<>();
        intBoolPair.print(25,true);

        Car car=new Car("Ford","Mustang");
        Pair<Car,Double> carPrice=new Pair<>();
        carPrice.print(car,110124.02);
    }
}
