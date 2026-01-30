package Lambda;

@FunctionalInterface //No Usuage ,similar to better readability
public interface Instructor<T> {

    public void teach(int numberOfStudents,T topic);
}
