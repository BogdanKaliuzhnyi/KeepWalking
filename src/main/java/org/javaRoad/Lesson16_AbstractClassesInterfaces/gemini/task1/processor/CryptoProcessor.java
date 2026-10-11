package org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.processor;

import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.base.PaymentProcessor;

public class CryptoProcessor extends PaymentProcessor {
    public CryptoProcessor(double amount) {
        super(amount);
    }

    @Override
    public void processPayment(double paymentAmount) {
        amount -= paymentAmount;
        System.out.println("CryptoProcessor: Транзакция завершена");
        printReceipt(paymentAmount);
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Успешно обработан платеж по крипто карте на сумму: " + amount);
    }
}
