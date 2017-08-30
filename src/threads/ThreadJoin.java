package threads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreadJoin {
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the execution of main thread");
        Runnable runnable = () -> {
            System.out.println("name : " + Thread.currentThread().getName());
            map.put(Thread.currentThread().getName(), Thread.currentThread().getName());

        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.setName("Thread");
        thread1.setName("Thread");
        thread2.setName("Thread");
        thread.start();
        thread1.start();
        thread2.start();

        /*thread.join();
        thread1.join();
        thread2.join();*/

//        I want to use multithreading for code block below.


        //...
        //But..Code after to these threads should execute as a whole.

        map.forEach((key, value) -> {
            System.out.println("key " + key + ", Value:" + value);
        });


        String[] unsorted = {};
        Arrays.sort(unsorted, (String obj, String obj2)->{
            if(obj.length()>obj2.length()){
                return 1;
            }else if(obj.length()<obj2.length()){
                return -1;
            }else{
                if(obj.equals(obj2)){
                    return 0;
                }
                for(int x=0;x<obj.length();x++){
                    if(Integer.valueOf(obj.charAt(x))>Integer.valueOf(obj2.charAt(x))){
                        return 1;
                    } else if(Integer.valueOf(obj.charAt(x))>Integer.valueOf(obj2.charAt(x))){
                        return -1;
                    }
                }
                return 0;
            }
        });

        System.out.println("Stopping the execution of main thread");
    }


}
