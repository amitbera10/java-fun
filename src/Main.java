import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean b;
    public static void main(String[] args) {


    }

    public static void printList(List<? extends Object> list) {
        Iterator iterator = list.iterator();
        iterator.hasNext();
        for (Object elem : list)
            System.out.println(elem + " ");
            System.out.println();
    }
}
