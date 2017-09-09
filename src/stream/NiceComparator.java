package stream;

import factory.PersonListFactory;
import pojo.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NiceComparator {
    public static void main(String[] args) {
        List<Person> personList = PersonListFactory.generateListOfPerson();
        Collections.sort(personList, Comparator.comparing(Person::getName).thenComparing(Person::getAge).thenComparing(Person::getHeight));
        personList.forEach(System.out::println);
    }
}
