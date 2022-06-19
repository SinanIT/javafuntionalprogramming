package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+08787564646664",
                LocalDate.of(2000, 1, 1));

        //  System.out.println(new CustomerValidatorService().isValid(customer)); //true

        // if I remove @ sign from email OR + from phone number i will get false. but ii don't know where the problem is exactly, it is not clear. For this we use combinator pattern


        //if valid we can store customer in db

        //Using Combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);
        System.out.println(result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
