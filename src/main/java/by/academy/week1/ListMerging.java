package by.academy.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMerging {

    public static List getMergedList(List<Integer>... lists) {
        List<Integer> sortedList = new ArrayList<>();
        for (List<Integer> i : lists) {
            sortedList.addAll(i);
        }
        Collections.sort(sortedList);
        return sortedList;
    }
}
