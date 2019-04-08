package by.academy.week1.week2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Анаграммы – это слова, которые состоят из одних и тех же символов,
 * но в разном порядке. Дан массив строк, найти в нем анаграммы и
 * вернуть список групп этих анаграмм. Каждый список отсортирован в
 * алфавитном порядке. Оценить сложность написанного алгоритма.
 * <p>
 * Пример:
 * <p>
 * ["eat", "tea", "tan", "ate", "nat", "bat"]
 * <p>
 * На выходе должны получить:
 * <p>
 * [
 * <p>
 * ["ate", "eat","tea"],
 * <p>
 * ["nat","tan"],
 * <p>
 * ["bat"]
 * <p>
 * ]
 * <p>
 * Примечание: каждая группа анаграмм тоже должна быть в нужном порядке,
 * т.е. группа ["ate", "eat","tea"] идет первой, потому что слово “eat”
 * было найдено первым в исходном массиве, ["nat","tan"] второй, потому
 * что “tan” было найдено вторым (вообще третьим, но т.к. “tea” вошло в первую
 * группу анаграмм, то считается вторым) и т.д.
 *
 * @author Александр Соколов
 * @since 2019-04-01
 */
public class AnagramService {

    private static Function<String, String> anagramCondition = e -> {
        char[] k = e.toCharArray();
        Arrays.sort(k);
        return String.valueOf(k);
    };

    public String[][] getAnagrams(String[] data) {
        return Arrays.asList(data).stream().collect(sortedGroupingBy(anagramCondition))
                .values().stream()
                .map(e -> e.toArray(new String[0]))
                .collect(toList())
                .toArray(new String[0][0]);
    }

    public static <T, K extends Comparable<K>> Collector<T, ?, LinkedHashMap<K, List<T>>>
    sortedGroupingBy(Function<T, K> function) {
        return Collectors.groupingBy(function,
                LinkedHashMap::new, toList());
    }
}
