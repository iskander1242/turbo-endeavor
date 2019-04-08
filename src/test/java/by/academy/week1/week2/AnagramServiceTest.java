package by.academy.week1.week2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Александр Соколов
 * @since 2019-04-07
 */
public class AnagramServiceTest {

    private String[] data = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
    private String[][] expected = new String[][]{new String[]{"eat", "tea", "ate"}, new String[]{"tan", "nat"}, new String[]{"bat"}};

    @Test
    public void getAnagrams() {
        String[][] actual = new AnagramService().getAnagrams(data);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertTrue(Arrays.equals(expected[i], actual[i]));
        }
    }
}