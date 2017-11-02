package threads;


public class ThreadException {
    public static void main(String[] args) {
        Thread t = new Worker();
        Thread.UncaughtExceptionHandler exceptionHandler = new Thread.UncaughtExceptionHandler(){
            public void uncaughtException(Thread th, Throwable ex) {
                System.out.println("Uncaught exception: " + ex);
            }
        };
        t.setUncaughtExceptionHandler(exceptionHandler);
        t.start();
    }
}

class Worker extends Thread{
    @Override
    public void run(){
        System.out.println("In worker thread");
        throw new NullPointerException("Exception occured in worker thread");
    }
}