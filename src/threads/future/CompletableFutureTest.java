package threads.future;


import java.util.concurrent.*;

public class CompletableFutureTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);


        for (int i=1;i<=4;i++) {
            Worker worker = new Worker("WORKER"+i);
            executorService.submit(worker);
        }
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"Hello",executorService);
        executorService.shutdown();
        String s = "";
        try {
            future.thenApply((e)->e.toUpperCase()).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("result :::"+s);

    }
}

class Worker implements Callable<String>{
    String wokerName;
    Worker(String wokerName){
        this.wokerName = wokerName;
    }
    @Override
    public String call(){
        System.out.println("Worker inside thread:"+wokerName);
        return wokerName;
    }
}
