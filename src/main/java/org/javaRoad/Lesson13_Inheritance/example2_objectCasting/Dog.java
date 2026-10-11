package org.javaRoad.Lesson13_Inheritance.example2_objectCasting;

public class Dog extends Animal {
    public static final String DOG_CLASS_NAME = "Dog";
    private final String color;

    public Dog(String color) {
        super(DOG_CLASS_NAME, "woof");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void sound() {
        System.out.println(color + " пёс сказал woof");
    }

    public void bark() {
        System.out.println("гав!");
    }
}
