package org.professorsu.java.lambda;

import org.professorsu.java.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class LambdaListToListSet {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(UUID.randomUUID().toString(), "Tom", 17, Person.Sex.MALE, "US"));
        personList.add(new Person(UUID.randomUUID().toString(), "Jerry", 25, Person.Sex.MALE, "US"));
        personList.add(new Person(UUID.randomUUID().toString(), "Joe", 21, Person.Sex.MALE, "UK"));
        personList.add(new Person(UUID.randomUUID().toString(), "Madison", 32, Person.Sex.FEMALE, "UK"));
        personList.add(new Person(UUID.randomUUID().toString(), "Rich", 39, Person.Sex.MALE, "CA"));
        personList.add(new Person(UUID.randomUUID().toString(), "Rachel", 22, Person.Sex.FEMALE, "CA"));

        List<String> personIds = personList.stream()
                .map(p -> p.getId()) // same as: .map(Person::getId)
                .collect(Collectors.toList());

        System.out.println("Person IDs:");
        personIds.forEach(p -> System.out.println(p));

        Set<String> countries = personList.stream()
                .map(p -> p.getCountry()) // same as: .map(Person::getCountry)
                .collect(Collectors.toSet());

        System.out.println();
        System.out.println("Person's countries:");
        countries.forEach(c -> System.out.println(c));
    }
}
