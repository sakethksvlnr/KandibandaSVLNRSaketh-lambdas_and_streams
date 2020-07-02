package optional_class_java8;

import java.util.Optional;

public class OptionalExample {


    public static void main(String[] args) {

        String[] str =new String[10];

        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent())
            System.out.println("value present");
        else System.out.println("Not present");


        /*****
         *
         *
         * Block 2
         *
         *
         */


        Optional<String> empty = Optional.empty();
        System.out.println(empty);


        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        Optional<String> value = Optional.of(str[5]);
        System.out.println("\nFiltered value: " + value.filter(s->s.equals("Abc")));

        System.out.println("Filtered value: " + value.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

        System.out.println("Getting value: " + value.get());

        System.out.println("Getting hashCode: " + value.hashCode());

        System.out.println("Is value present: " + value.isPresent());


        System.out.println("orElse : " + value.orElse("Value is not present"));

        System.out.println("orElse : " + empty.orElse("Value is not present"));

        value.ifPresent(System.out::println);



    }


}
