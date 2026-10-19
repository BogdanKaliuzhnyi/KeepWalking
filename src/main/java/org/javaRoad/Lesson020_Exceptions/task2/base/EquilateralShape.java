package org.javaRoad.Lesson020_Exceptions.task2.base;

public interface EquilateralShape {
    //    Поля интерфейса - всегда public static final
    String EMPTY_ELEMENT = " ";
    String EMPTY_STRING = "";
    char NEW_LINE_SYMBOL = '\n';

    //    Мы не можем определить поле length в интерфейсе, но можем указать, что каждый наследник обязан
//    определить поведение метода по получению значения length
    int getLength();

    String createShapeString();
}