package ru.academits.schepin.point;

import ru.academits.schepin.person.Person;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        p1.print();

        System.out.println();

        Person person1 = new Person("Иван");

        System.out.println(person1.getName());
    }
}
