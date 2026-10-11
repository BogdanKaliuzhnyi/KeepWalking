package org.javaRoad.Lesson016_AbstractClassesInterfaces.example1;

abstract class Shape {
    int x; // координата x
    int y; // координата y

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void print();
}

class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void print() {
        System.out.println("Drawing rectangle at " + x + ", " + y + ", " + width + ", " + height);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void print() {
        System.out.println("Drawing circle at " + x + ", " + y + ", " + radius);
    }
}


