package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by amit on 25/6/17.
 */
public class ThreadPools {
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("Hello India");
            System.out.println(Thread.currentThread());
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(r);
        executor.submit(r);
        executor.submit(r);
        executor.submit(r);
        executor.submit(r);
        executor.submit(r);
        executor.submit(r);


        executor.shutdown();
    }
}
