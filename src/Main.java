import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(4);
        intList.add(4);
        intList.add(3);
        intList.add(6);

       List<Integer> filterList = intList.stream()
                .map(e->e*2)
                .filter(e->e>5)
                .collect(Collectors.toList());
        System.out.println(filterList);

        Integer[] arrInt = {1,2,2,4,3,6};
        ArrayList<Integer> arrayListInt = Arrays.stream(arrInt)
                .map(e->e*2)
                .collect(Collectors.toCollection(ArrayList::new));

        Set<String> strings = new HashSet<>();
        show();

    }

    public static void show(){
        System.out.println("Show");
        System.gc();
        Runtime.getRuntime().gc();
    }

    public void finalize(){
        System.out.println("finalize : : :");
    }

}






