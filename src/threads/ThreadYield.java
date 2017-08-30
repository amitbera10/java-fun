package threads;

public class ThreadYield {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 11; i++) {
                System.out.println("Printing:::" + i);
            }
        });

        thread1.start();
    }
}
