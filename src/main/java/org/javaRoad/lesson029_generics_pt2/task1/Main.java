package org.javaRoad.lesson029_generics_pt2.task1;

import org.javaRoad.lesson029_generics_pt2.task1.model.SomeObject;

public class Main {
    /**
     * <a href="https://github.com/KFalcon2022/lessons/blob/master/lessons/java-core/029/Generics.%20Part%20II.md">...</a>
     * Реализуйте обобщенный тип, хранящий параметризованное поле. Также в классе Main реализуйте параметризованный
     * метод, принимает первым параметром объект вашего дженерика, вторым — объект типа, которым параметризован
     * объект первого параметра. Метод должен возвращать значение поля дженерика, если оно != null, в противном
     * случае — возвращать второй параметр.
     */
    public static void main(String[] args) {
        SomeObject<String> someStringObject = new SomeObject<>("Hello");
        System.out.println(getObject(someStringObject, "Bye"));
        System.out.println(getObject(null, "Bye"));

        SomeObject<Integer> emptyObject = new SomeObject<>(null);

        System.out.println(getObject(emptyObject, 0));
    }

    private static <T> T getObject(SomeObject<T> obj, T value) {
        return (obj == null || obj.getValue() == null) ? value : obj.getValue();
    }
}
