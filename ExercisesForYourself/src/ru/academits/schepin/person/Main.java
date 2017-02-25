package ru.academits.schepin.person;

public class Main {
    public static void main(String[] args) {
        int maxLength = Person.MAX_NAME_LENGTH;

        String formattedName = Person.formatName(" Иван Петрович");
        System.out.println(formattedName);
    }
}
