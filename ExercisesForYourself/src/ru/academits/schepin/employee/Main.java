package ru.academits.schepin.employee;

import static ru.academits.schepin.employee.TotalSalary.getTotalSalary;

public class Main {

    public static void main(String [] args) {
        Employee[] e = {new Director(), new Employee(), new Manager(), new Manager(), new Employee()};
        System.out.println(getTotalSalary(e));
    }
}
