package org.javaRoad.Lesson020_Exceptions.example.exceptions;

public class PersonNameException extends RuntimeException {
    public PersonNameException(String name, int minLength) {
        super("\"Недостаточная длина имени. Текущее значение: " + name + ". Минимальная длина имени: " + minLength);
    }
}