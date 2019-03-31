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
        assertTrue(new CheckParenthesesOrderService().isBalanced("()".toCharArray()));
        assertTrue(new CheckParenthesesOrderService().isBalanced("(){}[]".toCharArray()));
        assertFalse(new CheckParenthesesOrderService().isBalanced("(]".toCharArray()));
        assertFalse(new CheckParenthesesOrderService().isBalanced("([)]".toCharArray()));
        assertTrue(new CheckParenthesesOrderService().isBalanced("{[]}".toCharArray()));
    }
}