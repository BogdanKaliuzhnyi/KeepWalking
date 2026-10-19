package org.javaRoad.Lesson020_Exceptions.task3.service;

import org.javaRoad.Lesson020_Exceptions.task3.exception.ArrayValidationException;
import org.javaRoad.Lesson020_Exceptions.task3.model.Animal;

public class ArrayDataValidator  {
    public static void isValidArray(Animal[] array) throws ArrayValidationException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                sb.append("В массиве животных обнаружен Null-элемент (индекс ").append(i).append(")\n");
            }
        }
        if (!sb.isEmpty()) {
            throw new ArrayValidationException(sb.toString());
        }
        System.out.println("В массиве нет Null-элементов");
    }
}
