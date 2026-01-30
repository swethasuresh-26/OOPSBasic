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

//Annonymous class exists only till run tym and the space is freeded up post dat

//Anonymous Class Version 2
Runnable hwp=new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello World "+Thread.currentThread().getName());
    }
};
Thread t1=new Thread(hwp);
t1.start();

//Annonymous class version 3
        Runnable hwp1=()-> System.out.println("Hello World "+Thread.currentThread().getName());
        Thread t2=new Thread(hwp1);
        t2.start();

        //annonymous Class Version 4
        Thread t3=new Thread(()-> System.out.println("Hello World"+Thread.currentThread().getName()));
        t3.start();

        Instructor<String> i1=new Instructor<String>() {
            @Override
            public void teach(int numberOfStudents, String topic) {
                System.out.println("Teaching "+numberOfStudents+" of "+topic);
            }
        };
        i1.teach(100,"LLD");

        Instructor<String> i2=(numberOfStudents, topic)->{
            System.out.println("Teaching "+numberOfStudents+" of "+topic);
        };
        i2.teach(500,"Backend");

    }
}