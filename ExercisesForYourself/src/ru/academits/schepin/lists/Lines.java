package ru.academits.schepin.lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Lines {
    public static void main(String[] args) throws FileNotFoundException {

        List<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream("list.txt"))) {

            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }

            System.out.println(lines);

        }
    }

}