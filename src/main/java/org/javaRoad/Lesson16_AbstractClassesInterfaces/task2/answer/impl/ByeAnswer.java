package org.javaRoad.Lesson16_AbstractClassesInterfaces.task2.answer.impl;

import org.javaRoad.Lesson16_AbstractClassesInterfaces.task2.answer.Answer;

public class ByeAnswer implements Answer {
    @Override
    public String getAnswer() {
        return "Goodbye";
    }
}