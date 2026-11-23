package org.javaRoad.lesson030_regex.task2;

import org.javaRoad.lesson030_regex.task2.exception.FullNameValidationException;
import org.javaRoad.lesson030_regex.task2.model.FullName;

import java.util.Scanner;

/**
 * Реализуйте метод для работы с ФИО. Входным параметром должна являться строка, содержащая русскоязычное ФИО. Фамилия,
 * имя и отчество должны начинаться с прописной буквы и быть разделены пробелами. Фамилия может быть двойной и писаться
 * через дефис (каждая часть фамилии начинается с прописной буквы). Если строка валидна – верните ФИО, обернутое в
 * класс «Полное имя», содержащий фамилию, имя и отчество. Если невалидна – бросьте из метода исключение,
 * указывающее на ошибку валидации.
 */

public class Main {
    public static void main(String[] args) {
        String[] fios = {
                "Иванов Иван Иванович",
                " Иванов Иван  Иванович",
                "Петров Семён Олегович",
                "Иванов-Петров Иван Иванович",
                "Иванов - Петров Иван Иванович",
                "иванов Иван Иванович",
                "Иванов иван Иванович",
                "Borisov Peter Иванович",
                "Иванов ИВан Иванович"
        };
        test1(fios);
    }

    private static void test1(String[] fios) {
        for (String fio : fios) {
            try {
                System.out.println(createFullName(fio) + " создан успешно!");
            } catch (FullNameValidationException e) {
                System.out.println(fio + " " + e.getMessage());
            }
        }
    }

    private static FullName createFullName(String fio) {
        String[] separatedName = fio.split(" ");
        if (separatedName.length != 3) {
            throw new FullNameValidationException(
                    "ФИО должно быть разделено пробелами и должно содержать Фамилию, Имя и Отчество");
        }
        validateSecondName(separatedName[0]);
        validateFirstNameOrPatronomic(separatedName[1]);
        validateFirstNameOrPatronomic(separatedName[2]);
        return new FullName(separatedName[0], separatedName[1], separatedName[2]);
    }

    private static void validateFirstNameOrPatronomic(String partName) {
        if (!partName.matches(FullName.NAME_PATTERN)) {
            throw new FullNameValidationException("Имя или отчество не соответствует шаблону " + FullName.NAME_PATTERN);
        }
    }

    private static void validateSecondName(String secondName) {
        if (secondName.matches(FullName.NAME_PATTERN) || secondName.matches(FullName.DOUBLE_SECONDNAME_PATTERN)) {
            return;
        }
        throw new FullNameValidationException("Двойная фамилия должна быть разделена символом \"-\", " +
                "не должна содержать пробелов и обе части фамилии должны начинаться с заглавной буквы");
    }
}
