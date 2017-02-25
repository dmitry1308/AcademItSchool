package ru.academits.schepin.uppercase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            String[] a = new String[100];
            int i = 0;
            while (scanner.hasNextLine()) {
                a[i] = scanner.nextLine();
                String s = a[i];
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) {
                   c = Character.toUpperCase(c);
                }
                System.out.println(c);

            }
            ++i;
        }
    }
}



