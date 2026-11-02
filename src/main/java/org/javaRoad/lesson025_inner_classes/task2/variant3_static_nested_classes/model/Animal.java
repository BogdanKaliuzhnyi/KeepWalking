package org.javaRoad.lesson025_inner_classes.task2.variant3_static_nested_classes.model;

public abstract class Animal {
    public void sound() {
        System.out.println("Unknown kind of animal sounds");
    }

    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow");
        }
    }

    public static class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("Moo");
        }
    }

    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }
}