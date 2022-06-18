package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate:");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700304000"));
        System.out.println(isPhoneNumberValid("09003040900"));

        System.out.println("Wit Predicate: ");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700304000"));
        System.out.println(isPhoneNumberValidPredicate.test("09003040900"));

        System.out.println("Is phone Number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09003040900"));//false

        System.out.println("Is phone Number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07000030000"));//true

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() ==11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
