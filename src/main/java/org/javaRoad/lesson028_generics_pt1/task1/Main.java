package org.javaRoad.lesson028_generics_pt1.task1;


import org.javaRoad.lesson028_generics_pt1.task1.model.NumberExponentiator;

public class Main {
    public static void main(String[] args) {
        NumberExponentiator<Byte> byteExponentiater = new NumberExponentiator<>((byte) 3);
        NumberExponentiator<Short> shortExponentiater = new NumberExponentiator<>((short) 3);
        NumberExponentiator<Integer> intExponentiater = new NumberExponentiator<>(3);
        NumberExponentiator<Long> longExponentiater = new NumberExponentiator<>(3l);
        NumberExponentiator<Float> floatExponentiater = new NumberExponentiator<>(3f);
        NumberExponentiator<Double> doubleExponentiater = new NumberExponentiator<>(3d);


        System.out.println(byteExponentiater.exponentiate(3));
        System.out.println(shortExponentiater.exponentiate(3));
        System.out.println(intExponentiater.exponentiate(3));
        System.out.println(longExponentiater.exponentiate(3));
        System.out.println(floatExponentiater.exponentiate(3));
        System.out.println(doubleExponentiater.exponentiate(3));

    }
}
