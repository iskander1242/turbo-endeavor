package by.academy.week1;

import java.util.List;

/**
 * Solution for task 1.1
 */
public class PhoneNumber {

    public static String getPhoneNumberFirst(List<Integer> phoneNumbers) {
        StringBuilder sb = new StringBuilder();
        String phone = null;
        if (checkPhone(phoneNumbers)) {
            phoneNumbers.stream().forEach(n -> sb.append(n));
            phone = sb.toString();
            phone = phone.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1)$2-$3");
        } else {
            System.out.println("Check phone number list is failed");
        }
        return phone;
    }

    public static String getPhoneNumberSecond(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        if (checkPhone(numbers)) {
            numbers.stream().forEach(n -> sb.append(n));
            sb.insert(0, "(").insert(4, ")").insert(8, "-");
        } else {
            System.out.println("Check phone number list is failed");
        }
        return sb.toString();
    }


    private static boolean checkPhone(List<Integer> phoneNumber) {
        return !phoneNumber.isEmpty() && (phoneNumber.size() == 10);
    }
}
