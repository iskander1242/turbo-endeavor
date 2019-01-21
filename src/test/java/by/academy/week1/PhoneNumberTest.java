package by.academy.week1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static by.academy.week1.PhoneNumber.*;

public class PhoneNumberTest {

    private String phoneFormat ="(123)456-7890";
    private List<Integer> phoneNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    @Test
    public void testRegexMethod() {
        Assert.assertEquals(phoneFormat, new PhoneNumber().getPhoneNumberFirst(phoneNumber));
    }


    @Test
    public void testStringBuilderMethod() {
        Assert.assertEquals(phoneFormat, new PhoneNumber().getPhoneNumberSecond(phoneNumber));
    }
}
