
package prac;

public class Cars {
     private int e;
    String color;
    String seat;
    int m;
    
    public Cars(String x,String y)
    {
        this.e=2;
        color=x;
        seat=y;
        m=2;
    }
    public Cars(Cars o)           //Copy Constructor
    {
        this.e=o.e;
        color=o.color;
        seat=o.seat;
        m=o.m;
    }
    public Cars(String x)
    {
        e=2;
        color=x;
        seat="Woolan";
        m=2;
    }
    public Cars()
    {
        e=2;
        color="White";
        seat="Woolan";
        m=2;
    }
    public void xyz()
    {
        this.color="Pink";
        this.e=5;
    }
            
//    public void passByRef(Calculator c)
//    {
//        c.add(4,4);
//    }
//    
    
}
