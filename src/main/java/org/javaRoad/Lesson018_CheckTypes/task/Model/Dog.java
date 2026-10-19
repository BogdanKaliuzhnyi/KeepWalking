package org.javaRoad.Lesson018_CheckTypes.task.Model;

public class Dog extends Animal {
    private final String color;

    public Dog(String color) {
        super("woof");
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void woof() {
        sound();
    }
}
