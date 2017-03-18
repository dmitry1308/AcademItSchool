package ru.academits.schepin.InsertionSort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ReadFile {
    public static ArrayList<? extends Serializable> readFile(String sourcePath, String dataType) {

        //todo Абиривиатуры типов данных:
        String numbers = "-i";
        String letters = "-s";

        //todo Проверка переданного аргумента(цифры или строки):
        boolean isNumbers;
        if (dataType.equals(numbers)) {
            isNumbers = true;
        } else if (dataType.equals(letters)) {
            isNumbers = false;
        } else {
            throw new IllegalArgumentException("Введен неправильный аргумент");
        }


        //todo Создание сканера:
        try (Scanner scanner = new Scanner(new FileInputStream(sourcePath))) {
            // todo 1 вариант: если передали числа
            if (isNumbers) {
                ArrayList<Integer> listOfNumbers = new ArrayList<>(); // Создаю пустой список интеджеров:
                //todo Чтение файла из сканера
                while (scanner.hasNext()) {
                    listOfNumbers.add(scanner.nextInt());
                }
                return listOfNumbers;
            } else {
                // todo 2 вариант: если передали буквы:
                ArrayList<String> listOfLetters = new ArrayList<>(); // Создаю пустой список интеджеров:

                //todo Чтение файла из сканера:
                while (scanner.hasNextLine()) {
                    listOfLetters.add(scanner.nextLine());
                }
                return listOfLetters;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл: " + sourcePath);
        } catch (InputMismatchException e) {
            System.out.println("Файл содержит недопустимую информацию(поменяйте содержимое файла)!!!");
        }
        return null;
    }
}
