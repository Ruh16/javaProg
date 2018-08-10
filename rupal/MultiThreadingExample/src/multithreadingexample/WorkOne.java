package multithreadingexample;
public class WorkOne implements Runnable{

    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is Thread Work One.");
        }
    }
}
