package by.academy.week1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Пример:
 * 1. 1 касса и 3 покупателя (5, 3 и 4 товара
 * у каждого соответственно) -> будет затрачено 12 секунд.
 * 2. 2 кассы и 4 покупателя (10, 2, 3 и 3 товара
 * у каждого соответственно) -> будет затрачено 10 секунд
 * (первый покупатель займет кассу на 10 секунд,
 * из-за чего 3 оставшихся успеют купить товары во второй кассе).
 * 3. 2 кассы и 3 покупателя (2, 3 и 10 товар у каждого соответственно)
 * -> будет затрачено 12 секунд.
 */
public class CashiersTest {

    @Test
    public void testFirstExample() {
        Assert.assertEquals(12, Cashiers.computeteTotalDuration(1, Arrays.asList(5, 3, 4)));
    }

    @Test
    public void testSecondExample() {
        Assert.assertEquals(10, Cashiers.computeteTotalDuration(2, Arrays.asList(10, 2, 3, 3)));
    }

    @Test
    public void testThirdExample() {
        Assert.assertEquals(12, Cashiers.computeteTotalDuration(2, Arrays.asList(2, 3, 10)));
    }
}
