package stream;


import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        //forEach
        Stream.of("Hi", "How", "Are", "You")
                .forEach(System.out::println);
        //toArray
        int[] idArr = IntStream.range(10, 50)
                .map((e) -> e * 2).toArray();
        System.out.println("Arr ::" + idArr);

        //reduce
        System.out.println(IntStream.range(1, 10).
                reduce(0, (a, b) -> a + b)
        );

        //
        IntStream.range(10,20).filter((e)->e%2==0)
                .map((e)->e*2);

    }
}
