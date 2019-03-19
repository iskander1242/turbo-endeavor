package by.academy.week1.week2.task4.service;

/**
 * Сортировка массива
 * Задача - написать функцию, которая на вход принимает массив целочисленных
 * значений и сортирует его так, что только нечетные значения отсортированы
 * по возрастанию, четные же находятся на тех же местах, что и были.
 * Пример:
 * [5, 3, 2, 8, 1, 4] -> [1, 3, 2, 8, 5, 4]
 *
 * @author Александр Соколов
 * @since 2019-03-12
 */
public class ArraySortServiceImpl implements ArraySortService {
    private final SelectionSort selectionSort= new SelectionSort();

    public int[] sortOddItems(int[] unsorted) {
        int[] odds = new int[(int) Math.floor(unsorted.length / 2)];
        int k = 0;
        for (int i = 0; i < unsorted.length; i++) {
            if (i % 2 != 1) {
                odds[k] = unsorted[i];
                k++;
            }
        }
        odds = selectionSort.sort(odds);
        int j = 0;
        for (int i = 0; i < unsorted.length; i++) {
            if (i % 2 != 1) {
                unsorted[i] = odds[j];
                j++;
            }
        }
        return unsorted;
    }
}