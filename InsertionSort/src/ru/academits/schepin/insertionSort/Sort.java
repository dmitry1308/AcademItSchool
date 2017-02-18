package ru.academits.schepin.insertionSort;

public class Sort {
    public static int[] sort(int[] numbers) {
        for (int i = 1; i < numbers.length; ++i) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0 && numbers[j] > temp; --j) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = temp;
        }
        return numbers;
    }
}
