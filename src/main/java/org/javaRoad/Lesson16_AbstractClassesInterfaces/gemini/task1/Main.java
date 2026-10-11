package org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1;

import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.processor.CreditCardProcessor;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.processor.CryptoProcessor;

public class Main {
    public static void main(String[] args) {
        CryptoProcessor cp = new CryptoProcessor(2000);
        CreditCardProcessor ccp = new CreditCardProcessor(3000);

        System.out.println(ccp.amount);
        cp.processPayment(900);
        System.out.println(ccp.amount);
        System.out.println(cp.amount);

        cp.processPayment(300);
        System.out.println(cp.amount);
        ccp.refund(300);
        System.out.println(ccp.amount);
    }
}
