package by.academy.week1.week2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Александр Соколов
 * @since 2019-04-07
 */
public class AnagramServiceTest {

    @Test
    public void getAnagrams() {
        String[] data = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] expected = new String[][]{new String[]{"eat", "tea", "ate"}, new String[]{"tan", "nat"}, new String[]{"bat"}};
        String[][] actual = new AnagramService().getAnagrams(data);

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}