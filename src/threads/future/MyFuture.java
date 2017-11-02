package threads.future;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by amit on 12/10/17.
 */
public class MyFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(100);
                System.out.println("Insdie thread");
                return IntStream.range(1,10)
                        .map(e->e*2)
                        .filter(e->e>5)
                        .sum();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> future = executorService.submit(callable);
        System.out.println("Future :::: "+future.get());
    }
}
