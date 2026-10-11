package org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.processor;

import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.base.PaymentProcessor;
import org.javaRoad.Lesson16_AbstractClassesInterfaces.gemini.task1.base.Refundable;

public class CreditCardProcessor extends PaymentProcessor implements Refundable {
    public CreditCardProcessor(double amount) {
        super(amount);
    }

    @Override
    protected void processPayment(double paymentAmount) {
        this.amount -= paymentAmount;
        System.out.println("CreditCardProcessor: Транзакция завершена");
        printReceipt(paymentAmount);
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Успешно обработан платеж по кредитной карте на сумму: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund: " + amount);
    }
}