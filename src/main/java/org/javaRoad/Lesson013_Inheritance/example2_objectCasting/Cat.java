package org.javaRoad.Lesson013_Inheritance.example2_objectCasting;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "Cat";
    private final String color;

    public Cat(String color) {
        super(CAT_CLASS_NAME, "meow");
        this.color = color;
    }

    public String getColor(boolean isSpotted){
        return color;
    }

    @Override
    public void sound() {
        System.out.println(color + "котик сказал мяу");
    }
}
