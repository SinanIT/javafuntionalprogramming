package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999999");
        //normal java function
        System.out.println("normal java function");
        greetCustomerV1(maria);
        greetCustomerV2(maria, false);

        //Consumer Functional interface
        System.out.println("Consumer Functional interface");
        greetCustomerConsumerV1.accept(maria);
        System.out.println("Consumer Functional interface version 2");
        greetCustomerConsumerV2.accept(maria, false);


    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (costumer, showPhoneNumber) -> System.out.println("Hello " + costumer.customerName +
            ", thanks for registering phone number "
            + (showPhoneNumber ? costumer.customerPhoneNumber : "**********"));

    static void greetCustomerV2(Customer costumer, boolean showPhoneNumber){
        System.out.println("Hello " + costumer.customerName +
                ", thanks for registering phone number "
                + (showPhoneNumber ? costumer.customerPhoneNumber : "**********"));
    }


    static Consumer<Customer> greetCustomerConsumerV1 = costumer -> System.out.println("Hello " + costumer.customerName +
                    ", thanks for registering phone number "
                    + costumer.customerPhoneNumber);


    static void greetCustomerV1(Customer costumer){
        System.out.println("Hello " + costumer.customerName + ", thanks for registering phone number " + costumer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
