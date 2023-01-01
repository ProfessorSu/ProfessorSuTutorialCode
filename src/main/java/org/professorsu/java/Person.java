package org.professorsu.java;

import java.util.Objects;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String id;
    private String name;
    private int age;
    private Sex sex;
    private String country;

    public Person(String id, String name, int age, Sex sex, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex) && Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, country);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
