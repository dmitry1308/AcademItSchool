package ru.academits.schepin.InsertionSort;


import static ru.academits.schepin.InsertionSort.Sort.sort;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 7;
        array[1] = 6;
        array[2] = 12;
        array[3] = 3;

        sort(array);

        for (int a : array) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("***********");


        int[] array1 = {5, 8, 7, 12, 3};
        sort(array1);
        for (int a : array1) {
            System.out.print(a + " ");
        }


    }


}
