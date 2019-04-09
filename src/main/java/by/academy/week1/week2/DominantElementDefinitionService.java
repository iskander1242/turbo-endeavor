package by.academy.week1.week2;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * Доминирующий элемент – это элемент, который появляется в множестве более чем
 * N / 2 (где N – количество элементов в множестве).
 * <p>
 * Задача – написать сервис, который принимает
 * список элементов целочисленных значений, а возвращает доминирующий элемент.
 * <p>
 * Например:
 * <p>
 * [10, 9, 9, 9, 10] – доминирующий элемент 9
 * <p>
 * [3, 2, 3] – доминирующий элемент 3
 * <p>
 * [2, 2, 1, 1, 1, 2, 2] – доминирующий элемент 2
 * <p>
 * Примечание: список элементов обязан иметь
 * доминирующее число. Задачу необходимо решить с использованием
 * необходимых структур данных. Второе решение желательно тоже реализовать,
 * которое позволяет оптимально найти доминирующее число за O(n).
 *
 * @author Александр Соколов
 * @since 2019-04-01
 */

public class DominantElementDefinitionService {

    public Integer getDominantElement(Integer[] existed) {
        List<Integer> list = Arrays.asList(existed);
        Integer dominant = list.stream().collect(Collectors.groupingBy(Integer::intValue, counting()))
                .entrySet().stream()
                .filter(v -> v.getValue() > Math.floor(list.size() / 2))
                .findFirst().orElseThrow(NoSuchElementException::new)
                .getKey();
        return dominant;
    }
}
