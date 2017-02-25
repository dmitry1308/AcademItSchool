package ru.academits.schepin.lists;

import java.util.ArrayList;


public class Lines2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(9);
        numbers.add(10);


        ArrayList<Integer> numbers1 = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(!numbers1.contains(numbers.get(i))){
                numbers1.add(numbers.get(i));
            }
        }
        System.out.println(numbers1);
    }
}
