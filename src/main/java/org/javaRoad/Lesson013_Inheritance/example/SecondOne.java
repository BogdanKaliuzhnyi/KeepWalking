package org.javaRoad.Lesson013_Inheritance.example;

public class SecondOne extends FirstOne {
    public static void whoIAm() {
        FirstOne.whoIAm();
        System.out.println("It's me - Mario!");
    }

    @Override
    public void whoAmI() {
        super.whoAmI();
        System.out.println("It's me - Mario but objecyt!");
    }
}
