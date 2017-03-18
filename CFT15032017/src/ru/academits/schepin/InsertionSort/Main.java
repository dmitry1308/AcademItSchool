package ru.academits.schepin.InsertionSort;

import java.util.ArrayList;
import java.util.Comparator;

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

        //todo Чтение файла:
        ArrayList result = ReadFile.readFile(sourcePath, dataType);
        System.out.println(result);

        //todo Сортировка файла:
        Sort.sort(result, ascendingOrDecrease);
        System.out.println(result);

    }
}
