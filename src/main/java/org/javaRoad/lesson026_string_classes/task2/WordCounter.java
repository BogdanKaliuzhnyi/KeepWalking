package org.javaRoad.lesson026_string_classes.task2;

import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        sc.close();

        String[] words = splitSentence(sentence);
        if (words.length == 0) {
            System.out.println("Ошибка: в строке нет слов");
            return;
        }
        String[] uniqueWords = findUniqueWords(words);
        printUniqueWords(uniqueWords);
        System.out.println("\nКоличество уникальных слов: " + uniqueWords.length);
    }

    private static String[] splitSentence(String sentence) {
        sentence = sentence.trim().replaceAll("[^\\p{L}\\s]", " ");
        if (sentence.isBlank()) {
            return new String[0];
        }
        return sentence.split("\\s+");
    }

    private static String[] findUniqueWords(String[] words) {
        String[] uniqueWords = new String[words.length];
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueWords[counter] = words[i];
                counter++;
            }
        }

        uniqueWords = Arrays.copyOf(uniqueWords, counter);
        return uniqueWords;
    }

    public static void printUniqueWords(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
