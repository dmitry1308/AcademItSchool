package ru.academits.schepin.InsertionSort;

public class Sort {
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > temp; --j) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }
}

