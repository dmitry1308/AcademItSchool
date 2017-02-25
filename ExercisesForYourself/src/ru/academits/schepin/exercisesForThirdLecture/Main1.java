package ru.academits.schepin.exercisesForThirdLecture;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("123");
        names.add("234");
        names.add(1, "567"); // тогда 234 уйдет в конец списка;
        System.out.println(names);

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("dima");
        names2.add("yana");
        names2.addAll(names);
        System.out.println(names2);


        ArrayList<String> names3 = new ArrayList<>();
        names3.add("dima");
        names3.add("yana ");
        names3.add("barsik");
        names3.add("yana");

        names3.remove(0);

        for (int i = 0; i < names3.size(); ++i) {
            if (names3.get(i).contains("yana")) {
                names3.remove(i);
                --i;
            }
        }
        System.out.println(names3);

        names3.clear();
        System.out.println(names3);


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 56, 1, 1, 8, 9, 10, 1, 3, 6, 6));

        numbers.set(1, 56);
        System.out.println(numbers);

        int index11 = numbers.indexOf(11);
        System.out.println(index11);
        System.out.println();

        for (int a : numbers) {
            System.out.println(a);
        }

        int a = numbers.size();

        System.out.println(a);


        // Преобразование в массив:

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, 1, 5, 5, 8));

        Integer[] v = numbers1.toArray(new Integer[numbers1.size()]);

        for (int c : v) {
            System.out.print(c + " ");
        }


    }
}
