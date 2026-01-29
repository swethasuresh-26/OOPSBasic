package Generic;

public class Main {
    static void main(String[] args) {
        Pair<Integer,String> pairIdName=new Pair<>();
        pairIdName.print(10,"Dhruv");

        Pair<Integer,Boolean> intBoolPair=new Pair<>();
        intBoolPair.print(25,true);
    }
}
