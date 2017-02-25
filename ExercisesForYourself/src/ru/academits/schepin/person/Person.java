package ru.academits.schepin.person;


public class Person {
    private String name;

    public static int MAX_NAME_LENGTH = 5;  // статическое поле

    public Person(String name) {
        this.name=name;
    }

    public static String formatName(String name){ //статический метод
        return  name;
    }

    public String getName() {
        return name;
    }

}
