package ru.academits.schepin.insertionSort;

import java.util.Comparator;
import java.util.List;

public class Sort {
            //todo Сортировка по возростанию:
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
            //todo Сортировка по убыванию:
    public static <T> void sortDecreasing(List<T> list, Comparator<T> comparator) {
        for (int i = 1; i < list.size(); ++i) {
            T temp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && (comparator.compare(list.get(j), temp) < 0); --j) {
                list.set(j + 1, list.get(j));

            }
            list.set(j + 1, temp);
        }

    }

}
