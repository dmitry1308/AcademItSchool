package ru.academits.schepin.insertionSort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static ru.academits.schepin.insertionSort.Sort.sort;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Dmitry\\IdeaProjects\\AcademItSchool\\InsertionSort\\src\\ru\\academits\\schepin\\insertionSort\\input.txt"))) {

            int[] numbers = new int[100];


            //Чтение данных из файла:
            int count = 0;
            int i = 0;
            while (scanner.hasNext()) {
                System.out.println(numbers[i] = scanner.nextInt());
                ++i;
                count += 1;
            }
            System.out.println("Колличество строк в файле = " + count);
            System.out.println("******************************");


            sort(numbers);

            //Вывод отсортированных данных в консоль:
            System.out.println("Отсортированный файл: ");
            for (int j = 0; j < numbers.length; ++j) {
                if (numbers[j] == 0) {
                    continue;
                }
                System.out.println(numbers[j]);
            }

            //Запись отсортированных данных в файл:
            try (PrintWriter writer = new PrintWriter("C:\\Users\\Dmitry\\IdeaProjects\\AcademItSchool\\InsertionSort\\src\\ru\\academits\\schepin\\insertionSort\\output.txt")) {
                for (int k = 0; k < numbers.length; ++k) {
                    if (numbers[k] == 0) {
                        continue;
                    }
                    writer.println(numbers[k]);
                }
            }

        }
    }
}
