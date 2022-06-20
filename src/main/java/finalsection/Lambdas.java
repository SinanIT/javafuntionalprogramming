package finalsection;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        System.out.println(upperCaseName.apply("John"));

        System.out.println(upperCaseNAme.apply("John", 45));
    }
    //                 1                   1
    static Function<String, String> upperCaseName = name -> {
        //write a logic
        if (name.isBlank()) throw new IllegalArgumentException("");
        return name.toUpperCase();

    };

    static BiFunction<String, Integer, String> upperCaseNAme = (name, age) -> {
        //write a logic
        if (name.isBlank()) throw new IllegalArgumentException("Name field is blank");
        System.out.println(age);
        return name.toUpperCase();

    };
}
