package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Funtion takes one argument ad produces one result
        int increment = increment(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        //combine these two function
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("Combined " + addByOneAndThenMultiplyBy10.apply(4));

        // BiFunction takes two arguments and produces one result
        int i = incrementByOneAndMultiply(4 , 100);
        System.out.println(i);

        int j = incrementByOneAndMultiplyByFunction.apply(4, 100);
        System.out.println(j);


    }

    //same result as increment method
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;


    static int increment(int num) {
        return num + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int num, int numToMultiplyBy) {
        return (num + 1) * numToMultiplyBy;
    }


}
