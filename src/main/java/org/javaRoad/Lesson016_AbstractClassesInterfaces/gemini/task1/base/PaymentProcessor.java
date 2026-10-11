package org.javaRoad.Lesson016_AbstractClassesInterfaces.gemini.task1.base;

public abstract class PaymentProcessor {
    public double amount;

    protected PaymentProcessor(double amount) {
        this.amount = amount;
    }

    protected void processPayment(double paymentAmount) {
        System.out.println("Производится оплата в суперклассе");
    }

    public void printReceipt(double amount) {
        System.out.println("Успешно обработан платеж на сумму: " + amount);
    }
}