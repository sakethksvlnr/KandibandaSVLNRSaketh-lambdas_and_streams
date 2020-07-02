package Method_References;

import java.util.function.BiFunction;

public class MethodReference_For_Static_Method {


   static void  hello(){
        System.out.println("say something...............");
    }


    // Method For static Method Reference
    public static int add(int a, int b){
        return a+b;
    }


    public static float add(int a, float b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {


        /*****
         * Sayable interface Example for Method Reference :
         *
         * method say is replaced by hello() then call say() method through Sayable interface
         *
         * rules : method type must be same
         *
         *
         */

        Sayable sayable = MethodReference_For_Static_Method::hello;
        sayable.say();

             //can also override static methods by referring methods. In the following example,
             // we have defined and overloaded three add methods.

        BiFunction<Integer,Integer,Integer> biFunction = MethodReference_For_Static_Method::add;
        int result = biFunction.apply(11,11);
        System.out.println(result);

        BiFunction<Integer, Float, Float>adder2 = MethodReference_For_Static_Method::add;
        BiFunction<Float, Float, Float>adder3 = MethodReference_For_Static_Method::add;

        float result2 = adder2.apply(10, 20.0f);
        float result3 = adder3.apply(10.0f, 20.0f);

        System.out.println(result2);
        System.out.println(result3);
    }

}
