package org.javaRoad.lesson028_generics_pt1.task4;

import org.javaRoad.lesson028_generics_pt1.task4.exception.FindingNodeException;
import org.javaRoad.lesson028_generics_pt1.task4.model.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("1. Добавляем значения");
        System.out.println("До добавления" + stack.toStringAsArray());
        stack.add("Zero");
        stack.add("First");
        stack.add("Second");
        System.out.println("После добавления" + stack.toStringAsArray());

        System.out.println("\n2. Удаляем ноду:");
        stack.delete();
        System.out.println(stack.toStringAsArray());

        System.out.println("\n3. Глубина стека - " + stack.getSize() + " элементов(а)");

        System.out.println("\n4. Поиск по стеку:");
        tryToFind(stack, "First");
        tryToFind(stack, "Nope");
        tryToFind(stack, "Zero");

        System.out.println("\n5. Еще раз весь стек:\n" + stack.toStringAsArray());
    }

    private static <T> void tryToFind(Stack<T> stack, T t) {
        try {
            stack.hasValue(t);
            System.out.println("Значение \"" + t + "\" содержится в стеке");
        } catch (FindingNodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
