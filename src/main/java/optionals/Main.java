package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        Object value = Optional.ofNullable("Hello")
//                .orElseGet(() -> "default value");
//        System.out.println(value); //Hello

//        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
//        Object value = Optional.ofNullable(null)
//                .orElseThrow(exception);
//        System.out.println(value); //exception

        Optional.ofNullable("jhon@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));//Sending email to jhon@gmail.com

        
    }
}
