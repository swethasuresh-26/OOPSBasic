package Lambda;

public class Main {
    static void main(String[] args) {
        FourWheeler fourWheeler=new FourWheeler();
        fourWheeler.run();
        fourWheeler.brake();
        fourWheeler.start();

        ThreeWheeler threeWheeler=new ThreeWheeler();
        threeWheeler.brake();
        threeWheeler.run();
        threeWheeler.start();

        //Anonymous class allows to create object for interface by
        // providing implementation right wen we create object
        Vehicle twoWheeler=new Vehicle(){
            @Override
            public void start() {
                System.out.println("Runn Two Wheeler");
            }

            @Override
            public void run() {
                System.out.println("Start Two Wheeler");
            }

            @Override
            public void brake() {
                System.out.println("Brake Two Wheeler");
            }
        };
        twoWheeler.start();
        twoWheeler.run();
        twoWheeler.brake();
    }
}
//Annonymous class exists only till run tym and the space is freeded up post dat