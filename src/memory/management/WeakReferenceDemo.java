package memory.management;

import classes.InstanceVariableInitialization;

import java.lang.ref.WeakReference;

/**
 * Created by amit on 25/6/17.
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        InstanceVariableInitialization instanceVariableInitialization = new InstanceVariableInitialization();
       // String name = new String ("Amit");
        new Runnable(){
            @Override
            public void run() {
                System.gc();
                this.run();
                System.out.println("DDDDDD :: ");
            }
        }.run();
        WeakReference<String> weakReference = new WeakReference(new String ("Amit"));
        String name = weakReference.get();
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name : "+weakReference.get() + "name ref : "+name);

  /*      WeakReference r = new WeakReference(new String("I'm here"));
        WeakReference sr = new WeakReference("I'm here");
        System.out.println("before gc: r=" + r.get() + ", static=" + sr.get());
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // only r.get() becomes null
        System.out.println("after gc: r=" + r.get() + ", static=" + sr.get());*/
    }
}
