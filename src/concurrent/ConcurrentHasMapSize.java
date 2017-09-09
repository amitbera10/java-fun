package concurrent;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ConcurrentHasMapSize {

    public static void main(String[] args) {
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        Runnable r1 = ()->{
            IntStream.range(0,1000).forEach((e)->concurrentHashMap.put("key"+System.currentTimeMillis()+e,"value"+e));
        };

        Runnable r2 = ()->{
            long initTime =  System.currentTimeMillis();
            System.out.println("Size ::::::::::: "+concurrentHashMap.size());
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken :::: "+(endTime - initTime));
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.shutdown();
        try {
            executorService.awaitTermination(2, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size in main thread ::::::::::: "+concurrentHashMap.size());
    }
}
