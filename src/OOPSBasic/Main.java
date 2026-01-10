//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String args[]) {
        BankAccount abiSavings = new BankAccount("SBI001SV",5000,"Abhi");
       // System.out.println(abiSavings.getAccountHolder() + " " + abiSavings.getAccountBalance());
       abiSavings.printDetails();
        boolean accntBalance = abiSavings.isAccountBalMin();
        System.out.println("The balance is Minimum " + " " + accntBalance);

        BankAccount bublooSavings=new BankAccount();
        bublooSavings.accountNumber="HDFC002SV";
        bublooSavings.accountHolder="Dhikshit";
        bublooSavings.accountBalance=10000;

        System.out.println(bublooSavings.getAccountHolder()+" "+bublooSavings.getAccountNumber()+" ");
        System.out.println("The balance is Minimum " + " " + bublooSavings.isAccountBalMin());

        Student st=new Student(1,"Dhruv",100,01);
        Student st1=new Student(st);

        //Pass By Reference
        DemoClass demo=new DemoClass();
        demo.showMarks(st);
    }
}