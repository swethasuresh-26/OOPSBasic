package LibraryManagementSystem;

public abstract class User {
    private int id;
    private String name;
    private String contactInfo;

    //Constructor
    public User(){

    }
    //Paramterized Constructor
    public User(int id,String name,String contactInfo)
    {
        this.id=id;
        this.name=name;
        this.contactInfo=contactInfo;
    }

    //Abstract Methods
    public abstract void displayData();
    public abstract boolean canBorrowBooks();

    //Public Getters and Setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        if(name==null||name.equals(""))
            return;
        else
            this.name=name;
    }
    public String getContactInfo()
    {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo)
    {
        if(contactInfo==null||contactInfo.equals(""))
            return;
        else
            this.contactInfo=contactInfo;
    }

}
