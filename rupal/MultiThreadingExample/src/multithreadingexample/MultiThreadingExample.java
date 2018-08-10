package multithreadingexample;

public class MultiThreadingExample {

    public static void main(String[] args) {

        TaskOne t1 = new TaskOne();
        TaskTwo t2 = new TaskTwo();
        //t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        
        //WorkOne w1=new WorkOne();
        //Thread th1=new Thread(w1);
        
        Thread th1=new Thread(new WorkOne());
        th1.start();
        
        
        Thread th2=new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("This is Thread Anonymous");
                }
            }
        });
    }
}
