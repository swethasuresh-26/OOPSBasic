package Polymorphism;

import Inheritance.ICECar;

public class IceCar extends Car {
    int engineSize;

    public IceCar()
    {
        System.out.println("Printing child class Constructor");
    }
    public void refuelCar(){
        System.out.println("Refueling car");
    }

}
