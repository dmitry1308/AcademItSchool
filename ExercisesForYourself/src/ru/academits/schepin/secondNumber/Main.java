package ru.academits.schepin.secondNumber;

public class Main {

    public static int getSecondNumber(int[] array) {
        int max = array[0];
        int secondMax = array[0];


        for (int i = 0; i < array.length; ++i) {
            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            }
        }

        return secondMax;
    }


    public static void main(String[] args) {

        int[] array = {5, 6, 9, 8, 5, 8, 9, 4, 1, 6, 5};

        int secondNumber = getSecondNumber(array);
        System.out.println(secondNumber);
    }
}
