package stream;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestJavaStream {
    public static void main(String[] args) {
        //Get sum of number greater than 14 nad divisible by 3
        List<Integer> numberList = Arrays.asList(2, 3, 8, 15, 5, 8, 2, 16, 21, 36, 7, 1, 11);
       Integer sum = numberList.stream()
                .filter((e) -> e > 14)
                .filter((e) -> e % 3 == 0)
                .mapToInt((e)->e)
                .sum();
        System.out.println(sum);
    }
}
