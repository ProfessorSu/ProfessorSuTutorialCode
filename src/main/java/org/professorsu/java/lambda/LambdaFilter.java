package org.professorsu.java.lambda;

import org.professorsu.java.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class LambdaFilter {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(UUID.randomUUID().toString(), "Tom", 17, Person.Sex.MALE, "US"));
        personList.add(new Person(UUID.randomUUID().toString(), "Jerry", 25, Person.Sex.MALE, "US"));
        personList.add(new Person(UUID.randomUUID().toString(), "Joe", 21, Person.Sex.MALE, "UK"));
        personList.add(new Person(UUID.randomUUID().toString(), "Madison", 32, Person.Sex.FEMALE, "UK"));
        personList.add(new Person(UUID.randomUUID().toString(), "Rich", 39, Person.Sex.MALE, "CA"));
        personList.add(new Person(UUID.randomUUID().toString(), "Rachel", 22, Person.Sex.FEMALE, "CA"));

        List<Person> personsEligibleSelectiveService = personList.stream()
                // Only if the condition evaluation is true, item is kept
                .filter(p -> Person.Sex.MALE.equals(p.getSex()) && p.getAge() >= 18 && p.getAge() <= 25)
                .collect(Collectors.toList());

        personsEligibleSelectiveService.forEach(p -> System.out.println(p));
    }
}
