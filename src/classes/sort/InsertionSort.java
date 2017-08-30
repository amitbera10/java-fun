package classes.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amit on 25/7/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
  int[] ar = {3,1,5,8,4,6,9,14};
   int[] sortedAr =  sort(ar);
        List<Integer> sortedList = new ArrayList<Integer>(Arrays.asList());
        System.out.println("sorted ::::");
        for (int i=0;i<ar.length;i++){
            System.out.println(sortedAr[i]);
        }
        sortedList.stream().forEach(System.out::print);

    }

    static int[] sort(int[] ar){
        for (int i=1;i<ar.length;i++){
            int value = ar[i]; //1
            int j = i; //1

            while (j>0 && ar [j-1] > value){
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = value;
        }
        return ar;
    }
}
