package concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        Runnable r1 = ()-> atomicInteger.getAndIncrement();
        Runnable r2 = ()-> System.out.println(atomicInteger.get());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.shutdown();

    }
}
