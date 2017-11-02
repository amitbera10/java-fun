package collection;

import java.util.LinkedHashMap;


public class LinknedHashMapReinsert {
    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name","Amit");
        linkedHashMap.put("empid","EMP001");
        linkedHashMap.put("dept","DEPT01");
        linkedHashMap.put("name","Sahil");
        linkedHashMap.put(null,"ff");
        for (String s : linkedHashMap.keySet()){
            System.out.println(s + " : "+linkedHashMap.get(s));
        }
    }
}
