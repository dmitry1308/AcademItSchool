package ru.academits.schepin.employee;

public class TotalSalary {
    public static int getTotalSalary(Employee[] employees) {
        int result = 0;
        for (Employee e : employees) {
            result += e.getSalary();
        }
        return result;
    }
}

