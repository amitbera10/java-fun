package threads;

/**
 * Created by amit on 31/8/17.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
              while (true){
                  System.out.println("R1");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
            }
        };

        //runnable.run();
        Thread t1 = new Thread(runnable);
        t1.start();
        System.out.println("main thread completed.....");
    }
}
