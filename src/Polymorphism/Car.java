package Polymorphism;

import java.net.SocketOption;

public class Car {
    int id;
    String model;
    String color;

    public Car(){
        System.out.println("Executing Car Constructor");
    }
    public void unlockCar()
    {
        System.out.println("Unlocking Car");
    }
    public void changeEngineOil()
    {
        System.out.println("Changing Engine Oil");
    }
}
