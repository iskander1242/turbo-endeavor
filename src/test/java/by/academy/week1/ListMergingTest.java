package by.academy.week1;

import by.academy.week1.ListMerging;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListMergingTest {

    @Test
    public void mergingTest() {
        List<Integer> sortedListFirst = Arrays.asList(1, 3, 5);
        List<Integer> sortedListSecond = Arrays.asList(1, 2, 6, 8);
        Assert.assertEquals(Arrays.asList(1, 1, 2, 3, 5, 6, 8),
                ListMerging.getMergedList(sortedListFirst, sortedListSecond));
    }
}
