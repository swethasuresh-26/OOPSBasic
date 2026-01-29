package Generic;

public class Pair <A,B>{
    public A first;
    public B second;

    public Pair()
    {

    }
    public Pair(A first,B second)
    {
        this.first=first;
        this.second=second;
    }
    public void print(A a,B b)
    {
        System.out.println(a+" -> "+b);
    }
}
