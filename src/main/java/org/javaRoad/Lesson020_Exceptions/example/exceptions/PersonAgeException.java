package org.javaRoad.Lesson020_Exceptions.example.exceptions;


public class PersonAgeException extends Exception {
    public PersonAgeException(int age, int minAge, int maxAge) {
        super("Некорректный возраст. Текущее значение: " + age +
                ". Минимальный возраст: " + minAge + ". Максимальный возраст: " + maxAge);
    }
}