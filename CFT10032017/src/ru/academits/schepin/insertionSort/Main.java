package ru.academits.schepin.insertionSort;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static ru.academits.schepin.insertionSort.Sort.sortAscending;
import static ru.academits.schepin.insertionSort.Sort.sortDecreasing;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //todo Проверка кол-ва переданных аргументов:
        if (args.length != 4) {
            System.out.println("Недостаточно переданных параметров");
            return;
        }

        //todo Содержание аргументов:
        String sourcePath = args[0];
        String outputPath = args[1];
        String ascendingOrDecrease = args[2];
        String dataType = args[3];

        //todo Абиривиатуры возрастания и убывания:
        String ascending = "-a";
        String decrease = "-d";

        //todo Абиривиатуры типов данных:
        String numbers = "-i";
        String letters = "-s";

        //todo Проверка переданного аргумента(возростание или убывание):
        boolean isAscending;
        if (ascendingOrDecrease.equals(ascending)) {
            isAscending = true;
        } else if (ascendingOrDecrease.equals(decrease)) {
            isAscending = false;
        } else {
            throw new IllegalArgumentException("Введен неправильный аргумент");
        }

        //todo Проверка переданного аргумента(цифры или строки):
        boolean isDataType;
        if (dataType.equals(numbers)) {
            isDataType = true;
        } else if (dataType.equals(letters)) {
            isDataType = false;
        } else {
            throw new IllegalArgumentException("Введен неправильный аргумент");
        }

        //todo Создание сканера:
        try (Scanner scanner = new Scanner(new FileInputStream(sourcePath))) {
            // todo 1 вариант: если передали числа
            if (isDataType) {
                ArrayList<Integer> listOfNumbers = new ArrayList<>(); // Создаю пустой список интеджеров:
                //todo Чтение файла из сканера
                while (scanner.hasNextInt()) {
                    listOfNumbers.add(scanner.nextInt());
                }
                // todo 1 вариант: если сортировка по возростанию:
                if (isAscending)/*если в командной строке передано "-a" , то сортировка по возростанию */ {

                    // todo сортируем по возростанию
                    sortAscending(listOfNumbers, new IntegerComparator()); //Сортировка
                    System.out.println(listOfNumbers);

                } else {
                    // todo 2 вариант: если сортировка по убыванию:
                    // todo сортируем по убыванию:
                    sortDecreasing(listOfNumbers, new IntegerComparator());
                    System.out.println(listOfNumbers);
                }
                // todo Запись отсортированных данных в файл:
                try (PrintWriter writer = new PrintWriter(outputPath)) {
                    for (int k = 0; k < listOfNumbers.size(); ++k) {
                        writer.println(listOfNumbers.get(k));
                    }
                }

            } else {
                // todo 2 вариант: если передали буквы:
                ArrayList<String> listOfLetters = new ArrayList<>(); // Создаю пустой список интеджеров:

                //todo Чтение файла из сканера:
                while (scanner.hasNextLine()) {
                    listOfLetters.add(scanner.nextLine());
                }
                // todo 1 вариант: если сортировка по возростанию:
                if (isAscending) {
                    // todo сортируем по возростанию
                    sortAscending(listOfLetters, new StringComparator()); //Сортировка
                    System.out.println(listOfLetters);
                } else {
                    // todo 2 вариант: если сортировка по убыванию:
                    // todo сортируем по убыванию:
                    Sort.sortDecreasing(listOfLetters, new StringComparator()); //Сортировка
                    System.out.println(listOfLetters);
                }
                // todo Запись отсортированных данных в файл:
                try (PrintWriter writer = new PrintWriter(outputPath)) {
                    for (int k = 0; k < listOfLetters.size(); ++k) {
                        writer.println(listOfLetters.get(k));
                    }
                }
            }
        }
    }
}
