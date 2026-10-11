package org.javaRoad.Lesson13_Inheritance.Homework2.Model;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "Cat";
    private final String color;

    public Cat(String color) {
        super(CAT_CLASS_NAME, "meow");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void meow(){
        sound();
    }
}
