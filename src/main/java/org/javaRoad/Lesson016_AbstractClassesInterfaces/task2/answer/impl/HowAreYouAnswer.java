package org.javaRoad.Lesson016_AbstractClassesInterfaces.task2.answer.impl;

import org.javaRoad.Lesson016_AbstractClassesInterfaces.task2.answer.Answer;

public class HowAreYouAnswer implements Answer {
    @Override
    public String getAnswer() {
        return "How are you doing?";
    }
}