package stream;


import java.util.stream.IntStream;

/**
 * Created by amit on 24/9/17.
 */
public class ParallelStream {
    public static void main(String[] args) {
       int sum =  IntStream.range(1,10).map((e)->e*2).sum();

        System.out.println("Sum :"+sum);

    }
}
