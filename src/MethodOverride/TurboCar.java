package MethodOverride;

public class TurboCar extends Car{

    @Override
    public void startEngine()
    {
        System.out.println("Starting car engine with turbo booster");
    }

}
