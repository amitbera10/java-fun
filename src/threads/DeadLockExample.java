package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
    static String lock1 = "Amit";
    static String lock2 = "Vinay";


    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Acquired lock by thread1: " + lock1);
                for (int i = 0; i < 100000; i++) {

                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Acquired lock by thread1 : " + lock2);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Acquired lock by thread2: " + lock2);

//                try {
//            } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (lock1) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Acquired lock by thread2: " + lock1);
                }
            }
        });
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("processors" + processors);


        thread.start();
        thread2.start();
    }
}
