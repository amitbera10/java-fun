package threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstExecutorService {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("T1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("T2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //ExecutorService executorService = new ThreadPoolExecutor();
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.shutdown();
        //"Note: if we try to assign task after shutdown it will throw java.util.concurrent.RejectedExecutionException"
        //executorService.execute(t1);
        //todo: check with shutdownNow()
        //executorService.shutdownNow();
        System.out.println("Is shut down::: " + executorService.isShutdown());
        System.out.println("Is terminated:::: " + executorService.isTerminated());
        System.out.println("Main thread completed");
    }
}


