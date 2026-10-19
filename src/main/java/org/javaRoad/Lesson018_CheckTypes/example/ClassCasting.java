package org.javaRoad.Lesson018_CheckTypes.example;

/**
 * 1. Учет иерархии (Наследование)
 * p instanceof Employee вернет true, если объект p является экземпляром класса Employee, а также любого его
 * дочернего класса (подкласса).
 *
 * Пример: Если у вас появится класс SeniorEmployee extends Employee, то для объекта этого класса
 * instanceof Employee вернет true.
 *
 * p.getClass() == Employee.class проверяет точное совпадение типов (строгое равенство классов).
 *
 * Для объекта SeniorEmployee проверка p.getClass() == Employee.class вернет false, потому что его класс —
 * это SeniorEmployee, а не базовый Employee.
 *
 * 2. Безопасность при работе с null (Null-safety)
 * p instanceof Employee полностью безопасен. Если переменная p окажется null, оператор просто вернет false,
 * и программа продолжит работать.
 *
 * p.getClass() == Employee.class выбросит исключение NullPointerException, если p равен null, потому что
 * у null нельзя вызвать метод .getClass(). Перед таким сравнением всегда пришлось бы писать дополнительную защиту:
 * if (p != null && p.getClass() == Employee.class).
 */

public class ClassCasting {
    public static void main(String[] args) {
        Person emp = new Employee("Ivan", "VK");
        Person client = new Client("Olga", "Ozon");
        Person pers = new Person("Dima");

        getInfoV1(emp);
        getInfoV1(client);
        getInfoV1(pers);
    }

    private static void getInfoV1(Person p) {
        /**
         *С 16 версии Java после проверки объекта на instanceof не требуется нисходящее преобразование (downcasting)
         * Можно сразу писать emp.getCompany() без Employee emp = (Employee) p и т.п.
         */
        if (p instanceof Employee emp) {
            emp.getInfo();
            System.out.println(emp.getCompany());
            return;
        }
        if (p instanceof Client client) {
            client.getInfo();
            System.out.println(client.getBankName());
            return;
        }
        System.out.println("Probably it's just a person");
    }

    private static void getInfoV2(Person p) {
        if (p.getClass() == Employee.class) {
            Employee emp = (Employee) p;
            emp.getInfo();
            return;
        }

        if (p.getClass() == Client.class) {
            Client client = (Client) p;
            client.getInfo();
            return;
        }

        if (p.getClass() == Person.class) {
            Person pers = (Person) p;
            pers.getInfo();
        }
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void getInfo() {
        System.out.println("It's a person - " + getName());
    }
}

class Employee extends Person {
    String company;

    Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    protected String getCompany() {
        return company;
    }

    @Override
    protected void getInfo() {
        System.out.println("It's a employee - " + getName() + " who works for " + getCompany());
    }
}

class Client extends Person {
    String bankName;

    Client(String name, String bankName) {
        super(name);
        this.bankName = bankName;
    }

    protected String getBankName() {
        return bankName;
    }

    @Override
    protected void getInfo() {
        System.out.println("It's a client - " + getName() + " who is from company " + getBankName());
    }
}