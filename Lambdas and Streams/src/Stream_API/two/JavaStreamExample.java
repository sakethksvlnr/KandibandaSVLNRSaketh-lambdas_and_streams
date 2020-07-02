package Stream_API.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {

    public static void main(String[] args){
        Stream.iterate(1, element->element+1)
                .filter(element->element % 2==0)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        /**
         *   Filtering and Iterating Collection
         *
         *   here we use Person class
         *   let's see the given example how we filter and iterate collection using stream
         */

             List<Person> personList = new ArrayList<>();

             personList.add(new Person("Saad",19));
             personList.add(new Person("Sabit",15));
             personList.add(new Person("Enam",27));
             personList.add(new Person("Neam",35));
             personList.add(new Person("Arif", 22));
             personList.add(new Person("ekram",28));
             personList.add(new Person("Karim",52));
             personList.add(new Person("Rahim",43));

             // filter and iterate
             personList.stream()
                     .filter(person -> person.getAge() <30)
                     .forEach(person -> System.out.println(person.getName()));


                      System.out.println("-----------------------");

             //Sum by using Collectors Methods

               int sumOfAge = personList.stream()
                       .collect(Collectors.summingInt((person)->person.getAge()));
               System.out.println("Sum OF Age : " + sumOfAge + "\n");

             // Find Max and Min

               Person obj = personList.stream()
                       .max((p1,p2)->
                               p1.getAge() > p2.getAge()?1:-1).get();
               System.out.println("Maximum Age : " + obj.getAge());

               Person minAge = personList.stream()
                       .min((p1,p2)-> p1.getAge() > p2.getAge()?1:-1).get();
               System.out.println("Minimum Age : " + minAge.getAge());



             // Stream Example: count() Method in Collection

               int count =(int) personList.stream()
                       .filter(p-> p.getAge() <30)
                       .count();

               System.out.println("\nCount total person whose age below 30 : " + count);



             // Stream Example : Convert List into Set

                Set<Integer> personSet = personList.stream()
                .filter(person -> person.getAge() <30)
                .map(person -> person.getAge())
                .collect(Collectors.toSet());
                System.out.println("\n Person Set : " + personSet);


             // Converting Person List into a Map

                  Map<Integer,String> personMap = personList.stream()
                          .collect(Collectors.toMap(p->p.getAge(),p->p.getName()));
                System.out.println("\n List into Map : " + personMap);


             // Method Reference in stream

               List<Integer> integerList = (List<Integer>) personList.stream()
                       .filter(person -> person.getAge() <30)
                       .map(Person::getAge)
                       .collect(Collectors.toList());
                System.out.println("\n Method Reference in stream : " + integerList);


    }

}
