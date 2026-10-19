package org.javaRoad.Lesson020_Exceptions.example;

import org.javaRoad.Lesson020_Exceptions.example.exceptions.PersonAgeException;
import org.javaRoad.Lesson020_Exceptions.example.exceptions.PersonNameException;

class Program{

    public static void main(String[] args) throws Exception {

        createPerson("Tom", -10);
        createPerson("m", 20);
    }

    static void createPerson(String name, int age){

        try{

            var person = new Person(name, age);
            person.print();
        }
        catch(PersonNameException ex){

            System.out.println("Ошибка в имени:");
            System.out.println(ex.getMessage());
        }
        catch(PersonAgeException ex){

            System.out.println("Ошибка в возрасте:");
            System.out.println(ex.getMessage());
        }
    }
}

class Person{

    private String name;
    private int age;
    private static int nameMinLength = 2;
    private static int minAge = 1;
    private static int maxAge = 110;

    Person(String name, int age) throws PersonNameException, PersonAgeException {

        if(name.length() < nameMinLength) throw new PersonNameException(name, nameMinLength);
        if(age < minAge || age > maxAge) throw new PersonAgeException(age, minAge, maxAge);
        this.name = name;
        this.age = age;
    }

    void print(){ System.out.printf("Name: %s; Age: %d\n", name, age); }
}