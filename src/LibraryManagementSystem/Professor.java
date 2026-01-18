package LibraryManagementSystem;

public class Professor extends User{
    private int MAX_BORROW_LIMIT=15;
    private int professorID;
    private int currentBorrowed=0;
    public Professor(int id, String name, String contactInfo,int currentBorrowed,int professorID) {
        super(id, name, contactInfo);
        this.currentBorrowed=currentBorrowed;
        this.professorID=professorID;
    }


    public int getProfessorID() {
        return this.professorID;
    }


    public void setProfessorID(int id) {
        this.professorID=id;
    }

    @Override
    public void displayData() {
        System.out.println("Professor Name : "+getName());
        System.out.println("Professor ID : "+getProfessorID());
        System.out.println("Professor ContactInfo : "+getContactInfo());

    }

    @Override
    public boolean canBorrowBooks() {
        return currentBorrowed<MAX_BORROW_LIMIT;
    }
}
