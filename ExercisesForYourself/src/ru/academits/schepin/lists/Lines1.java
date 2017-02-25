package ru.academits.schepin.lists;

import java.util.ArrayList;


public class Lines1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        System.out.println(numbers);
    }
}
