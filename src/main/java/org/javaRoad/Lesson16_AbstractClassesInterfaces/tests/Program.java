package org.javaRoad.Lesson16_AbstractClassesInterfaces.tests;

public class Program{

    public static void main(String[] args) {

        Car car = new Car();
        car.move();     // Едем на машине
        car.stop();     // Останавливаемся
    }
}

interface Movable{

    void move();
    default void stop() {
        System.out.println("Останавливаемся");
    }
}
// класс машины
class Car implements Movable{

    public void move(){

        System.out.println("Едем на машине");
    }
}