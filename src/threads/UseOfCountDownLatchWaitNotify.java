package threads;

import java.util.concurrent.CountDownLatch;

public class UseOfCountDownLatchWaitNotify {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Application Started..........");

        CountDownLatch countDownLatch1 = new CountDownLatch(4);
        CountDownLatch countDownLatch2 = new CountDownLatch(4);
        Object lockObject = new Object();

        MyWorker myWorker1 = new MyWorker(countDownLatch1, countDownLatch2, 1, lockObject);
        MyWorker myWorker2 = new MyWorker(countDownLatch1, countDownLatch2, 2, lockObject);
        MyWorker myWorker3 = new MyWorker(countDownLatch1, countDownLatch2, 3, lockObject);
        MyWorker myWorker4 = new MyWorker(countDownLatch1, countDownLatch2, 4, lockObject);

        myWorker1.start();
        myWorker2.start();
        myWorker3.start();
        myWorker4.start();

        countDownLatch1.await();

        synchronized (lockObject) {
            lockObject.notifyAll();
        }
        countDownLatch2.await();
        System.out.println("Application Stopped..........");
    }
}

class MyWorker extends Thread {
    CountDownLatch countDownLatch1;
    CountDownLatch countDownLatch2;

    int id;
    Object lockObject;

    MyWorker(CountDownLatch countDownLatch1, CountDownLatch countDownLatch2, int id, Object lockObject) {
        this.countDownLatch1 = countDownLatch1;
        this.countDownLatch2 = countDownLatch2;
        this.id = id;
        this.lockObject = lockObject;
    }

    @Override
    public void run() {
        System.out.println("Thread : " + id + "Started");
        countDownLatch1.countDown();
        synchronized (lockObject) {
            try {
                lockObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread : " + id + "Finished");
            countDownLatch2.countDown();
            lockObject.notify();
        }
    }
}
