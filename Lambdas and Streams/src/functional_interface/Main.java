package functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {


       /***
         ## Functiopnal Interface Predicate Example:
         A Predicate is one such function accepting a single argument to evaluate to a boolean result.

         it has method :
         boolean test(T t);

         Here,
         Person class is used for this purpose
       */

        Predicate<Person> predicate =(person -> person.getAge() >19);
        boolean result  = predicate.test(new Person("Enamul", 27));
        System.out.println("\nPredicate Example: " + result);
        System.out.println();




       /***
         ## Functiopnal Interface Function Example:

         it has method :
         R apply(T t);

         Here,
         we have 2 class one is Person and other is PersonDTO
         now we converted
         Person class property
                to
         PersonDTO class property
               using
         Function Interface
         see the Example given below
       */

        Function<Person,PersonDTO> function = (entity)->{
            return new PersonDTO(entity.getName(),entity.getAge());
        };
        PersonDTO personDTO = function.apply(new Person("Karim", 43));
        System.out.println("Function Example: " + personDTO.getName() + " " + personDTO.getAge());
        System.out.println();


       /***
         ## Functiopnal Interface Supplier Example

         it has method :
         T get();

         Here,
         Person class converted into Supplier Properties.
       */

        Supplier<Person> supplier =()->{return new Person("Rohim", 26);};
        Person p = supplier.get();
        System.out.println("Supplier Example: " + "Name: " +p.getName() + " age: "+ p.getAge());


        /**
         * To define lambdas with two arguments, we have to use additional interfaces that
         * contain “Bi” keyword in their names:
         * BiFunction, ToDoubleBiFunction, ToIntBiFunction, and ToLongBiFunction.
         *
         */




        /***
         ## Functiopnal Interface BiFunction Example

         it has method :
         R apply(T arg0, U arg1);

         Here,
         Person class converted into BiFunction Properties.
         */



        BiFunction<Person,Person,Integer> biFunction = (p1,p2)->(p1.getAge()+p2.getAge());

        int ageTotal = biFunction.apply(new Person("P1", 27),new Person("p2", 33));
        System.out.println("BiFunction Example: " +  ageTotal);




    }




}
