package ru.academits.schepin.InsertionSort;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Sort {

    public static ArrayList sort( ArrayList<? extends Serializable> list , String ascendingOrDecrease) {


        //todo Условия сортировки:

        //todo Абиривиатуры возростания и убывания:
        String ascending = "-a";
        String decrease = "-d";


        //todo Проверка переданного аргумента(возростание или убывание):
        boolean isAscending;
        if (ascendingOrDecrease.equals(ascending)) {
            isAscending = true;
        } else if (ascendingOrDecrease.equals(decrease)) {
            isAscending = false;
        } else {
            throw new IllegalArgumentException("Введен неправильный аргумент");
        }

        if (isAscending) {
            sortAscending(list, new StringComparator);
        }

        return list;
    }




    public static <T> void sortAscending(List<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); ++i) {
            T temp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && (comparator.compare(list.get(j), temp) > 0); --j) {
                list.set(j + 1, list.get(j));

            }
            list.set(j + 1, temp);
        }

    }


}
