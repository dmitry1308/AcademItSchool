package ru.academits.schepin.insertionSort;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import static ru.academits.schepin.insertionSort.Sort.sortAscending;
import static ru.academits.schepin.insertionSort.Sort.sortDecreasing;

public class Main {
    public static void main(String[] args) {
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

        //todo Абиривиатуры возростания и убывания:
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
        try (Scanner scanner = new Scanner(new FileInputStream(sourcePath));
             PrintWriter writer = new PrintWriter(outputPath)) {
            // todo 1 вариант: если передали числа
            if (isDataType) {
                ArrayList<Integer> listOfNumbers = new ArrayList<>(); // Создаю пустой список интеджеров:
                //todo Чтение файла из сканера
                while (scanner.hasNext()) {
                    listOfNumbers.add(scanner.nextInt());
                }
                // todo 1 вариант: если сортировка по возростанию:
                if (isAscending)/*если в командной строке передано "-a" , то сортировка по возростанию */ {
                    // todo сортируем по возростанию
                    sortAscending(listOfNumbers, new IntegerComparator()); //Сортировка

                    String result = String.format("Цифры по возростанию = %s", listOfNumbers);
                    System.out.println(result);
                } else {
                    // todo 2 вариант: если сортировка по убыванию:
                    // todo сортируем по убыванию:
                    sortDecreasing(listOfNumbers, new IntegerComparator());

                    String result = String.format("Цифры по убыванию = %s", listOfNumbers);
                    System.out.println(result);
                }
                // todo Запись отсортированных данных в файл:
                for (Integer listOfNumber : listOfNumbers) {
                    writer.println(listOfNumber);
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

                    String result = String.format("Буквы по возростанию = %s", listOfLetters);
                    System.out.println(result);
                } else {
                    // todo 2 вариант: если сортировка по убыванию:
                    // todo сортируем по убыванию:
                    Sort.sortDecreasing(listOfLetters, new StringComparator()); //Сортировка

                    String result = String.format("Буквы по убыванию = %s", listOfLetters);
                    System.out.println(result);
                }
                // todo Запись отсортированных данных в файл:
                for (String listOfLetter : listOfLetters) {
                    writer.println(listOfLetter);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл in.txt");
        } catch (InputMismatchException e) {
            System.out.println("Файл содержит недопустимую информацию(поменяйте содержимое файла)!!!");
        }
    }
}
