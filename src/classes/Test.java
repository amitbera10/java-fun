package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test<T extends CharSequence> {
    static Integer i;

    public static void main(String[] args) {

        Test<CharSequence> test= new Test<>();
        test.toString();

//        Object[] objects = {new Integer(5), 10, new String("Amit"), new ArrayList<>(), new Object()};
//        Arrays.sort(objects);
//        System.out.println("objects ::: " + objects);
//        List<String> strList = new ArrayList<>();
//        strList.add("A");
//        strList.add("B");
//        strList.add("C");
//        display(strList);

    }

    public void display(Class<T> aTClass) throws Exception{
        T test= aTClass.newInstance();
    }


}
