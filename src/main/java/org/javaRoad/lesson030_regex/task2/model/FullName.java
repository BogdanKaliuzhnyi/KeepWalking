package org.javaRoad.lesson030_regex.task2.model;


public class FullName {
    public static final String NAME_PATTERN = "^[А-Я][а-яё]+$";
    public static final String DOUBLE_SECONDNAME_PATTERN = "^[А-Я][а-яё]+-[А-Я][а-яё]+$";
    private final String lastName;
    private final String firstName;
    private final String patronymic;

    public FullName(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + patronymic;
    }

}
