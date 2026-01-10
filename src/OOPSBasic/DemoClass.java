public class DemoClass {

    public void showMarks(Student st)
    {
        System.out.println(st.marks);
        doubleMarks(st);
        System.out.println(st.marks);
    }
    public void doubleMarks(Student st)
    {
        st.marks=2* st.marks;
        System.out.println(st.marks);
        st=null;
    }
}
