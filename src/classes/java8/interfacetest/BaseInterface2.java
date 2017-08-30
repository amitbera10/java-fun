package classes.java8.interfacetest;

/**
 * Created by amit on 6/7/17.
 */
public interface BaseInterface2 extends BaseInterface1 {
    int i = 2;
    default void show(){
        System.out.println("2");
    }
}
