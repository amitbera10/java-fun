package threads;

/**
 * Created by amit on 28/8/17.
 */
public class ThreadParttenPrint {
    static boolean lock1 = true;
    static boolean lock2 = true;
    public static void main(String[] args) {
        ThreadParttenPrint threadParttenPrint = new ThreadParttenPrint();
        threadParttenPrint.pripartten();
    }



    void pripartten(){
        Object o = new Object();
        Thread t1 = new Thread(()->
        {
            try {
                int i = 0;
                synchronized (o) {
                    while (i < 10) {
                        if (!ThreadParttenPrint.lock1) {
                          o.wait();
                        }else {
                            System.out.println(0);
                            ThreadParttenPrint.lock1 = false;
                            ThreadParttenPrint.lock2 = true;
                            try {
                                o.notify();
                                o.wait();
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                            i++;
                        }

                    }
                }
            }catch (Exception e){
    e.printStackTrace();
            }
        }
        );


        Thread t2 = new Thread(()->
        {
            try {
                int i = 0;
                synchronized (o) {
                    while (i < 10) {
                        if (!ThreadParttenPrint.lock2) {
                           o.wait();
                        }else {
                            System.out.println(1);
                            ThreadParttenPrint.lock2 = false;
                            ThreadParttenPrint.lock1 = true;
                            try {
                                o.notify();
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                            i++;
                        }

                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        );
        t2.start();
        t1.start();
    }
}
