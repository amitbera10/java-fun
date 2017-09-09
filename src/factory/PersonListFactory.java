package factory;

import pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 5/9/17.
 */
public class PersonListFactory {
    public static List<Person> generateListOfPerson(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Amit",20,5.6));
        personList.add(new Person("Pankaj",21,5.7));
        personList.add(new Person("Amit",22,5.8));
        personList.add(new Person("Amit",20,5.5));
        personList.add(new Person("Himanshu",23,5.6));
        personList.add(new Person("Mandeep",21,5.7));
        personList.add(new Person("Sahil",20,5.0));
        personList.add(new Person("Hitesh",22,5.2));

        return personList;
    }
}
