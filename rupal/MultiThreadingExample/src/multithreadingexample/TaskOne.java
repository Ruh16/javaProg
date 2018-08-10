package multithreadingexample;

public class TaskOne extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("This is Task One.");
        }

    }

}
