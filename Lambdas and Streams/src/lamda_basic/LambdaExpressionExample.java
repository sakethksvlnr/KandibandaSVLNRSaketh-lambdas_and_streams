package lamda_basic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/***************
 *
 *
 *   Here all interface of this package<lamda_basic> are user defined
 *
 *   so, first see the interface & look at the example :: happY coaDing :)
 *
 *
 *
 */

public class LambdaExpressionExample {


    public static void main(String[] args) {


        /**
         * Drawable interface Example : with no param
         */
        int width=10;
        Drawable drawable =()-> { System.out.println("Draw :" + width); };
        drawable.draw();



        /**
         * Sayable interface Example : with no param
         */

        // technique 01
        Sayable sayable =()->("Say Something");
        System.out.println(sayable.say());

        // technique 02
        Sayable sayable1 =()->{return "Say Something 2";};
        System.out.println(sayable1.say());




        /**
         * Printable interface Example : with One param
         */
        Printable printable =(msg -> System.out.println(msg));
        printable.print("print something ....");




        /*****
         * Addable interface Example : with 2 param
         * int type method
         */

            Addable addable =(a,b)->(a+b);
        System.out.println(addable.add(10,20));




        /*****
         * Addable interface Example : with 2 param
         * int type method
         */

        Addable2 addable2 = (a,b)->{
            System.out.println("Addable2 Example with void method :" + (a+b));};
        addable2.add(12,5);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*****
         * IAvarage interface Example : with array input
         *
         */

        IAvarage iAvarage = (array)->{
            System.out.println("--------IAvarage interface Example---------");
            double sum =0;
            int size = array.length;
            System.out.println("Array Size : "+ size);

            for (int i=0;i<size;i++){
                sum+=array[i];
            }
            System.out.println("Sum of Array : " + sum);
            return  sum/size;
        };

        int[] iAvarageArray = {1,4,6,8,9};
        System.out.println(iAvarage.avg(iAvarageArray));
        System.out.println("-----------------------");


////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /*****
         * Comparator interface Example :
         *
         */



///   Lambda Expression Example: Comparator   ///////////////

        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));


      /*
        // Without lambda expression.
        // Sort list by age
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(listOfPerson, comparator);

        System.out.println(" sort persons by age in ascending order");
        for (Person person : listOfPerson) {
            System.out.println(" Person name : " + person.getName());
        }

     */



        // Witht lambda expression.
        // Sort list by age

        Collections.sort(listOfPerson, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge(); });
        System.out.println(" sort persons by age in ascending order");
        listOfPerson.forEach(
                (person) -> System.out.println(" Person name : " + person.getName()));


        System.out.println("---------------------------------------------");

/////////////////////////////////////////////////////////////////////////////////////////















    }


}
