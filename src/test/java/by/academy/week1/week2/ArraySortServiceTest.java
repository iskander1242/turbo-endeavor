package by.academy.week1.week2;

import by.academy.week1.week2.task4.service.ArraySortService;
import by.academy.week1.week2.task4.service.ArraySortServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Александр Соколов
 * @since 2019-03-12
 */
public class ArraySortServiceTest {

    private final int[] UNSORTED = new int[]{5, 3, 2, 8, 1, 4};

    private final ArraySortService arraySortService= new ArraySortServiceImpl();

    @Test
    public void test() {
        Assert.assertTrue(Arrays.equals(new int[]{1, 3, 2, 8, 5, 4}, arraySortService.sortOddItems(UNSORTED)));
    }
}
