package threads.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FirstScheduledExecutorService {
    public static void main(String[] args) {
        DemoCallable<String> callable1 = new DemoCallable<>("work1");
        DemoCallable<String> callable2 = new DemoCallable<>("work2");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(callable1,5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(callable2,5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdownNow();
        System.out.println("Main thread completed");
    }
}

class DemoCallable<T> implements Callable {
    String workName;

    DemoCallable(String workName) {
        this.workName = workName;
    }

    public T call() {
        System.out.println("Callable called with work ::::" + workName);
        return (T) workName;
    }
}
