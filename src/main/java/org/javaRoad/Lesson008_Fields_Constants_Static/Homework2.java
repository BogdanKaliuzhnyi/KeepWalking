package org.javaRoad.Lesson008_Fields_Constants_Static;

public class Homework2 {
    public static void main(String[] args) {
        Counter counter = new Counter("Simple",10);
        counter.increase(2);
        counter.increase(3);
        counter.decrease(5);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.counter);
    }
}

class Counter {
    public final String name;
    public int counter;

    public Counter(String name) {
        this(name, 0);
    }

    public Counter(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}