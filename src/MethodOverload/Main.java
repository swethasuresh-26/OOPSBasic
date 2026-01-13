package MethodOverload;

public class Main {
    public static void main(String[] args) {

        Calculator calc=new Calculator();

        /*
        calc.addIntInt(4,5);
        calc.addDoubleInt(4.5,5);
        calc.addIntDouble(5,4.5);

        The above code works fine but i dont want this to happen as i need something abstract
        So we use method overload
        */
        calc.add(4,5);
        calc.add(4.5,5);
        calc.add(5,4.5);

    }
}
