package OOPSBasic;

public class Student {
    int id;
    String name;
    int marks;
    int rollNo;


    public Student(Student st) {
        this(st.id, st.name, st.marks, st.rollNo);
    }

    public Student(int sId, String sName, int sMarks, int sRoll) {
        id = sId;
        name = sName;
        marks = sMarks;
        rollNo = sRoll;
    }
}

