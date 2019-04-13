package by.academy.week1.week2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Александр Соколов
 * @since 2019-03-31
 * <p>
 * 1. () – корректная
 * 2. (){}[] – корректная
 * 3. (] – не корректная
 * 4. ([)] – не корректная
 * 5. {[]} – корректная
 */
public class CheckParenthesesOrderTest {

    @Test
    public void test() {
        CheckParenthesesOrderService orderService = new CheckParenthesesOrderService();
        assertTrue(orderService.isBalanced("()".toCharArray()));
        assertTrue(orderService.isBalanced("(){}[]".toCharArray()));
        assertFalse(orderService.isBalanced("(]".toCharArray()));
        assertFalse(orderService.isBalanced("([)]".toCharArray()));
        assertTrue(orderService.isBalanced("{[]}".toCharArray()));
    }
}