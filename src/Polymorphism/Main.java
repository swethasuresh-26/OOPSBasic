package Polymorphism;

public class Main {
   public static void main() {

       IceCar iceCar=new IceCar();
       iceCar.changeEngineOil();
       iceCar.unlockCar();
       iceCar.refuelCar();

       Car car=new IceCar(); //Implicit Casting
       car.unlockCar();
       car.changeEngineOil();

       IceCar ic=(IceCar) new Car(); //Explicit Casting //Not allowed
       ic.changeEngineOil();
    }
}
