package org.javaRoad.lesson030_regex.task3;

import org.javaRoad.lesson030_regex.task3.exception.IncorrectWordException;

/**
 * Реализуйте задачу из пакета original.
 * Теперь слова в исходном массиве могут быть разделены несколькими пробелами, а также знаками табуляции и иными
 * пробельными символами. Словами считаются лишь подстроки, состоящие из буквенных символов или содержащие в середине
 * слова один или несколько дефисов, но не более одного подряд. При наличии в исходной строке невалидных символов или
 * некорректном использовании допустимых, должно быть выброшено исключение.
 * P.S. от меня
 * Можно улучшить, если пересобрать метод подсчета - сделать его возвращающим кол-во уникальных строк и вызывать в нём
 * методы сплита и валидации
 */

public class Main {
    private static final String REGEX_CYR = "^[А-ЯЁа-яё]+(-[А-ЯЁа-яё]+)*$";
    private static final String REGEX_LAT = "^[a-zA-Z]+(-[a-zA-Z]+)*$";
    //private static final String REGEX_SYMBOLS = "(?U)\\W";

    public static void main(String[] args) {
        // 15 уникальных слов
        String sentence = "  This is a\tsentence just a Example того аты-баты какие аты-баты-шли-солдаты и Шалтай-Болтай Строки мы можем обрабатывать а какие строки нет";
        System.out.println("1 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));

        sentence = "This is a\tsentence just an examplе того какие аты-баты мы можем обрабатывать а какие строки нет";
        System.out.println("\n2 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));

        sentence = "This is a\tsentence just an examp1e того какие строки мы можем обрабатывать а какие строки нет";
        System.out.println("\n3 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));

        sentence = "This is a\tsentence just an example того какие строки- мы можем обрабатывать а какие строки нет";
        System.out.println("\n4 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));

        sentence = "This is a\tsentence just an example того какие строки мы можем обрабаТывать а какие строки нет";
        System.out.println("\n5 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));

        sentence = "This is a\tsentence - just an example того какие строки мы можем обрабатывать а какие строки нет";
        System.out.println("\n5 предложение:" + sentence);
        countUniqueWords(splitSentence(sentence));
    }

    private static String[] splitSentence(String sentence) {
        //(?U) В регулярных выражениях Java (начиная с Java 7) флаг (?U) включает режим UNICODE_CHARACTER_CLASS
        // (Pattern.UNICODE_CHARACTER_CLASS). Он заставляет предопределённые классы символов (\w, \d, \s, \b и др.)
        // работать по правилам Unicode, а не только для ASCI

        String[] words = sentence.trim().split("\\s+");
        validateWords(words);
        return words;
    }

    private static void validateWords(String[] words) {
        for (String word : words) {
            if (!word.matches(REGEX_CYR) && !word.matches(REGEX_LAT)) {
                throw new IncorrectWordException("Invalid word: " + word);
            }

//            if (!word.matches(REGEX_CYR) && !word.matches(REGEX_LAT) && !word.matches(REGEX_SYMBOLS)) {
//                throw new IncorrectWordException("Invalid word: " + word);
//            }
        }
    }

    private static void countUniqueWords(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            // Каждое слово в массиве сравниваем с предыдущими словами того же массива.
            // Если слово эквивалентно одному из предыдущих - оно не уникально
            int j = 0;
            boolean isUnique = true;

//            if (words[i].matches(REGEX_SYMBOLS)) {
//                continue;
//            }

            while (j < i && isUnique) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    isUnique = false;
                } else {
                    j++;
                }
            }

            if (isUnique) {
                counter++;
                System.out.println("\"" + words[i] + "\" is unique");
            }
        }

        System.out.printf("Found %d unique words\n", counter);
    }
}
