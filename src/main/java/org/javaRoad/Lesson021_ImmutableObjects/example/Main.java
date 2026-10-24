package org.javaRoad.Lesson021_ImmutableObjects.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        //Animal animal2 = new Cat("hello"); Т.к. Animal final, мы не можем присвоить переменной animal2
        // ссылку на объект Cat, несмотря на то, что Cat является наследником Animal
    }
}
