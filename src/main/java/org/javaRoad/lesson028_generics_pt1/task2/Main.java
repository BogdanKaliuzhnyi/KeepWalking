package org.javaRoad.lesson028_generics_pt1.task2;

import org.javaRoad.lesson028_generics_pt1.task2.model.WrappedClass;

public class Main {
    public static void main(String[] args) {
        WrappedClass<String> example = new WrappedClass<>("Example");
        WrappedClass<String> example2 = new WrappedClass<>(null);
        System.out.println(example.isNull());
        System.out.println(example2.isNull());
    }
}
