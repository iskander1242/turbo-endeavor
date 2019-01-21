package by.academy.week1;

import java.util.List;

/**
 * Solution for task 1.1
 */
public class PhoneNumber {

    private final String REPLACEMENT = "($1)$2-$3";
    private final int SIZE_STRING_PHONE_NUMBER = 10;
    private final String PHONE_REGEX = "(\\d{3})(\\d{3})(\\d{4})";

    public String getPhoneNumberFirst(List<Integer> phoneNumbers) {
        StringBuilder sb = new StringBuilder();
        String phone = null;
        if (checkPhone(phoneNumbers)) {
            phoneNumbers.stream().forEach(n -> sb.append(n));
            phone = sb.toString().replaceFirst(PHONE_REGEX, REPLACEMENT);
        } else {
            System.out.println("Check phone number list is failed");
        }
        return phone;
    }

    public String getPhoneNumberSecond(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        if (checkPhone(numbers)) {
            numbers.stream().forEach(n -> sb.append(n));
            sb.insert(0, "(").insert(4, ")").insert(8, "-");
        } else {
            throw new IllegalArgumentException();
        }
        return sb.toString();
    }


    private boolean checkPhone(List<Integer> phoneNumber) {
        return !phoneNumber.isEmpty() && (phoneNumber.size() == SIZE_STRING_PHONE_NUMBER);
    }
}
