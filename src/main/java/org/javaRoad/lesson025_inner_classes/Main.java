package org.javaRoad.lesson025_inner_classes;

public class Main {
    String classType = "OuterClass";
    Inner inner = new Inner();

    public static void main(String[] args) {
        Main m = new Main();
        m.inner.print();
        m.inner.k = 15;
        m.inner.print();
        m.print();
    }


    void print() {
        System.out.println(classType);
    }

    private class Inner {
        private String classType = "InnerClass";
        private int k = 10;

        void print() {
            System.out.println(classType);
            System.out.println("K is " + k);
        }
    }


}
