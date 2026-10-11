package org.javaRoad.Lesson16_AbstractClassesInterfaces.example1;

public class Program {
    static public void main(String[] args) {

        Shape shape1 = new Rectangle(5,1,10,7);
        Shape shape2 = new Circle(4,6,12);

        shape1.print();
        shape2.print();
    }
}
