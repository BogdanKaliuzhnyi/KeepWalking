package org.javaRoad.Lesson007_Varargs_Overloading_Recursion;

public class Homework {
    public static void main(String[] args) {
        exercise1();
    }

    static void exercise1() {
        String s1 = "Я";
        String s2 = "помню";
        String s3 = "чудное";
        String s4 = "мгновение";
        String s5 = "передо";
        String s6 = "мной";
        String s7 = "явилась";
        String s8 = "ты";
        System.out.println(exercise1_1(s1, s2, s3, s4, s5, s6, s7, s8));
    }

    static String exercise1_1(String... args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if (i == args.length - 1) {
                return sb.toString();
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
