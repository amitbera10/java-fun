package classes.supertest;

import java.util.stream.IntStream;

/**
 * Created by amit on 27/7/17.
 */
public class SuperTest {
    public static void test(int s) throws Exception{
        System.out.println("Hi");
    }

    public static void main(String[] args)  throws Exception{

    }
}
class A{
    A(){
        System.out.println("A cons");
    }
    void show(){
        System.out.println( "super from showA"+super.getClass());
    }
}

class B extends A{

    B(){
        super();
    }

    void show(){
        super.show();
        System.out.println( "super from showB"+super.getClass());
    }

}

