package classes;

import java.util.concurrent.ConcurrentHashMap;

public class InstanceVariableInitialization {
    final static String name = new String("Amit");
    String s1 = "fck";

    public static void main(String[] args) {
        InstanceVariableInitialization instanceVariableInitialization1 = new InstanceVariableInitialization();
        InstanceVariableInitialization instanceVariableInitialization2 = new InstanceVariableInitialization();

        System.out.println(instanceVariableInitialization1.name == instanceVariableInitialization2.name);

    }
}
