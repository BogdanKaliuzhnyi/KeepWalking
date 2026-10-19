package org.javaRoad.Lesson018_CheckTypes.task.Model;

public class Cat extends Animal {
    private final String color;

    public Cat(String color) {
        super("meow");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void meow(){
        sound();
    }
}
