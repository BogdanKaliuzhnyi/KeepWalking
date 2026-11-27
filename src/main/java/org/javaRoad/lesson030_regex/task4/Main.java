package org.javaRoad.lesson030_regex.task4;


/**
 * Реализуйте программу, разбивающую исходный текст на составные части. Текст – на абзацы (разделены '\n'), абзацы
 * на предложения (разделены ./?/?!/!/…). Предложения на слова (разделены пробелами, но также могут использоваться
 * знаки препинания ,/-/:).
 * После этого выведите на экран исходный текст. Предложения допустимо разделить точками, слова – пробелами без
 * сохранения знаков пунктуации внутри предложения. Сохранение изначальной пунктуации, на мой взгляд, излишне усложнит
 * задачу и сдвинет акцент с практики регулярных выражений.
 * Подумайте, как наиболее корректно декомпозировать ваше решение.
 * В качестве совета: попробуйте разные подходы для решения задачи, нет необходимости реализовать наиболее оптимальным
 * способом. Например, одним из вариантов упрощения исходной задачи может стать избавление от лишних символов или их
 * замена одним определенным через метод replaceAll() класса String.
 */
public class Main {
    public static void main(String[] args) {
        String text = """
                Сегодня утром я проснулся рано. За окном шёл дождь, а ветер усиливался!
                Я подумал: стоит ли выходить на прогулку? Наверное123, да... Пог1ода иногда меняется неожиданно.
                
                По дороге я встретил старого друга - Андрея. Мы давно не виделись, поэтому разговор получился долгим. 
                «Как твои дела?» - спросил он. «Всё хорошо!» - ответил я. Кто-то бы промол1чал...
                """;

        String[] paragraphs = getParagraphs(text);
        printStringArray(paragraphs, "параграфы");
        System.out.println();
        String paragraphAsString = joinParagraphs(paragraphs);

        String[] sentences = getSentences(paragraphAsString);
        printStringArray(sentences, "предложения");
        System.out.println();

        String[] words = getWords(joinParagraphs(sentences));
        printStringArray(words, "слова");
    }


    private static String[] getParagraphs(String text) {
        return text.split("\n+");
    }

    private static String joinParagraphs(String[] paragraphs) {
        StringBuilder sb = new StringBuilder();
        for (String paragraph : paragraphs) {
            sb.append(paragraph).append(" ");
        }
        return sb.toString();
    }

    private static String[] getSentences(String text) {
        return text.split("[.]{3}\\s|[.!…]\\s|[?]!?\\s");
    }

    private static String[] getWords(String text) {
        return text.replaceAll("[\".,«»?:;!…]", "").split("(?U) - |\\s+");
           }

    private static void printStringArray(String[] array, String type) {
        System.out.println("Печатаем " + type);
        int count = 1;
        for (String s : array) {
            System.out.println(count++ + ")" + s);
        }
    }
}
