package LibraryManagementSystem;

public class Member extends User {
    private int MAX_BORROW_LIMIT=5;
    private int currentBorrowed=0;

    public Member() {}

    public Member(int id, String name, String contactInfo, int currentBorrowed) {
        super(id, name, contactInfo);
        this.currentBorrowed = currentBorrowed;
    }

    @Override
    public void displayData() {
        System.out.println("Name "+getName());
    }
    @Override
    public boolean canBorrowBooks()
    {
        return currentBorrowed<MAX_BORROW_LIMIT;
    }


}
