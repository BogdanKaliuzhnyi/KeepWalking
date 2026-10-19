package org.javaRoad.Lesson017_Enum;

public class Main {
    enum DayOfWeek {
        MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
        THURSDAY("Четверг"),FRIDAY("Пятница"), SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        final String inRussian;

        DayOfWeek(String inRussian) {
            this.inRussian = inRussian;
        }
    }

    public static void main(String[] args) {
        DayOfWeek current = DayOfWeek.MONDAY;
        current = DayOfWeek.TUESDAY;

        DayOfWeek[] week = DayOfWeek.values();
        for (DayOfWeek dw : week) {
            System.out.println(dw.inRussian);
        }
        /** Пытался разобраться с методом valueOf()
         *       //System.out.println(DayOfWeek.valueOf("MONDAY"));
         *       //System.out.println(DayOfWeek.valueOf("Понедельик")); < опечатка предумышленная, падает в ошибку
         *
         *      === Пример корректного применения .valueOf() ===
         *          Scanner scanner = new Scanner(System.in);
         *         System.out.print("Введите день недели заглавными буквами (например, MONDAY): ");
         *         String userInput = scanner.nextLine(); // Пользователь ввел "MONDAY"
         *
         *         try {
         *             // Превращаем String в объект энама DayOfWeek
         *             DayOfWeek day = DayOfWeek.valueOf(userInput);
         *
         *             System.out.println("Выбранный день успешно распознан: " + day);
         *
         *             if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
         *                 System.out.println("Это выходной!");
         *             } else {
         *                 System.out.println("Это рабочий день.");
         *             }
         *
         *         } catch (IllegalArgumentException e) {
         *             System.out.println("Ошибка! Такого дня недели не существует в нашем энаме.");
         *         }
         *     }
         * }
         */
    }
}
