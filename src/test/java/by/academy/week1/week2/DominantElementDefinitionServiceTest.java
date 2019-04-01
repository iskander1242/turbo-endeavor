package by.academy.week1.week2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <p>
 * Например:
 * <p>
 * [10, 9, 9, 9, 10] – доминирующий элемент 9
 * <p>
 * [3, 2, 3] – доминирующий элемент 3
 * <p>
 * [2, 2, 1, 1, 1, 2, 2] – доминирующий элемент 2
 * <p>
 *
 * @author Александр Соколов
 * @since 2019-04-01
 */
public class DominantElementDefinitionServiceTest {
    @Test
    public void test() {
        assertEquals(9, new DominantElementDefinitionService().getDominantElement(new Integer[]{10, 9, 9, 9, 10}));
        assertEquals(3, new DominantElementDefinitionService().getDominantElement(new Integer[]{3, 2, 3}));
        assertEquals(2, new DominantElementDefinitionService().getDominantElement(new Integer[]{2, 2, 1, 1, 1, 2, 2}));
    }
}