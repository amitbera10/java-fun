package classes;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer i1 = new Integer(2);
        Integer i2 = new Integer(2);
        Integer i3 = 228;
        Integer i4 = 228;

        System.out.println(i1==i2);
        //System.out.println(i3==i2);
        System.out.println(i3==i4);

         String s1 = "gdghdh0.545hjdhd6665";
         String[] s2 = s1.replaceAll("[^0-9]+"," ").trim().split(" ");
         Integer i5 = Arrays.stream(s2).mapToInt(Integer::valueOf).sum();
         System.out.println(i5);


    }
}
