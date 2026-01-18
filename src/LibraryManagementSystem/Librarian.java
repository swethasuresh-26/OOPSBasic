package LibraryManagementSystem;

public class Librarian extends User{

    private String employeeNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Librarian(int id, String name, String contactInfo, String employeeNumber) {
        super(id, name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayData() {
        System.out.println("Name:"+getName());
        System.out.println("Employee Number"+getEmployeeNumber());
        System.out.println("Contact Number"+getContactInfo());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
}
