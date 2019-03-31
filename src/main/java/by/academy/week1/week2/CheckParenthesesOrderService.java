package by.academy.week1.week2;

import java.util.Stack;

/**
 * Корректные скобочки
 * Дана строка, содержащая следующие символы: ‘)’, ‘(‘, ‘}’, ‘{’, ‘[’, ‘]’.
 * Задача: определить, является ли переданная строка корректной. Она будет таковой, если:
 * 1. Открывающие скобочки должны быть закрыты закрывающими того же типа.
 * 2. Открывающие скобочки должны быть закрыты в нужном порядке.
 * 3. Пустая строка тоже считается правильной.
 * Пример:
 * 1. () – корректная
 * 2. (){}[] – корректная
 * 3. (] – не корректная
 * 4. ([)] – не корректная
 * 5. {[]} – корректная
 *
 * @author Александр Соколов
 * @since 2019-03-31
 */
public class CheckParenthesesOrderService {
    public boolean isBalanced(char[] unbalanced) {
        Stack<Character> stack = new Stack<>();

        for (char character : unbalanced) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.empty()) return false;
                Character head = stack.pop();
                    if ((head == '(' & character != ')')
                            || (head == '[' & character != ']')
                            || (head == '{' & character != '}')) {
                        return false;
                    }
            }
        }
        return stack.empty();
    }
}
