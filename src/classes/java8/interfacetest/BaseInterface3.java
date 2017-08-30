package classes.java8.interfacetest;

/**
 * Created by amit on 6/7/17.
 */
public interface BaseInterface3 extends BaseInterface1 {
    default void show(){
        System.out.println("3");
    }
}
