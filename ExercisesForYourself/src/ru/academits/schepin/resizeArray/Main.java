package ru.academits.schepin.resizeArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static String[] resizeArray(String[] array) {
        String[] result = new String[array.length * 2];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }


    public static void main(String[] args) throws FileNotFoundException {

        String[] lines = new String[3];

        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\Dmitry\\IdeaProjects\\AcademItSchool\\ExercisesForYourself\\src\\ru\\academits\\schepin\\resizeArray\\input.txt"))) {

            int i = 0;
            while (scanner.hasNextLine()) {
                if (i == lines.length) {
                    lines = resizeArray(lines);
                }

                System.out.println(lines[i] = scanner.nextLine());
                ++i;
            }
        }
    }
}
