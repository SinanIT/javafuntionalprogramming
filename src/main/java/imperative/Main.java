package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Julia", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        //Imperative Approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }

        //declarative Approach
        System.out.println("Declarative Approach ");

        Predicate<Person> personPredicate = t-> FEMALE.equals(t.gender);
        people.stream().filter(personPredicate).forEach(System.out::println);
        System.out.println("Declarative Approach second way");
        people.stream().filter(t->t.gender.equals(FEMALE)).forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person( String name, Gender gender){
            this.name =name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
