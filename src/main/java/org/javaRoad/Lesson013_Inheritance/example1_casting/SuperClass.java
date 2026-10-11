package org.javaRoad.Lesson013_Inheritance.example1_casting;

public class SuperClass {
    public void doSth() {
        System.out.println("SuperClass doSth");
    }
}

class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.doSth();   // OK
        subClass.doSth2();  // OK
        // Upcasting - повышающее приведение, неявное (поскольку не требует явного указания о касте).
        SuperClass subClass2 = new SubClass();
        subClass2.doSth();   // OK
        //subClass2.doSth2();  // Oшибка компиляции

        // Down casting - сужающее (явное, понижающее) приведение
        SuperClass subClass3 = new SubClass();
        SubClass castedSubClass = (SubClass) subClass3;

        castedSubClass.doSth();   // OK
        castedSubClass.doSth2();  // OK
    }

    public void doSth2() {
        System.out.println("SubClass doSth");
    }
}
