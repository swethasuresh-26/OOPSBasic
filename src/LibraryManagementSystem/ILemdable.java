package LibraryManagementSystem;

public interface ILemdable {
    boolean lend(User user);
    void returnBook(User user);

}
