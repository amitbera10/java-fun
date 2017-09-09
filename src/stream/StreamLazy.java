package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//intermediate operation in stream are lazy.
public class StreamLazy {
    public static void main(String[] args) {
        //find the first number greater than 6 and divisible by 3
        List<Integer> integerList = Arrays.asList(2, 1, 5, 6, 9, 3, 7, 8);
        List<Integer> results = new ArrayList<>();
        integerList.stream()
                .filter(StreamLazy::isGreaterThan6)
                .filter(StreamLazy::isDivisibleBy3);
                //.findFirst();

        System.out.println(":::::::::::::::::::::Main :::::::::::::::::::::::::::::::::");

    }

    public static boolean isGreaterThan6(Integer i){
        System.out.println("Is greater than 6 called");
        return i>6;
    }

    public static boolean isDivisibleBy3(Integer i){
        System.out.println("Is divisible by 3");
        return i%3==0;
    }
}
