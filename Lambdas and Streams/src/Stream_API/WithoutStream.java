package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutStream {


  private static List<A> list = new ArrayList<A>();

    static {

        list.add(new A("Enam", 27));
        list.add(new A("Neam",34));
        list.add(new A("Arif",22));
        list.add(new A("Rohim",42));
        list.add(new A("karim",48));
    }


    private static void withoutStream(){

        List<Integer> integerList = new ArrayList<>();

        for (A a : list){ if (a.getAge() <30){ integerList.add(a.getAge()); } }
        for (int age : integerList){ System.out.println(age); }
    }


    // ---------  With Stream  ---------
    private static void withStream(){
        System.out.println("----------------  With Stream  ------------------");
        List<Integer> integerList = list.stream()
                .filter(a -> a.getAge()  <30)
                .map(a -> a.getAge())
                .collect(Collectors.toList());

        integerList.forEach(a-> System.out.println(a));
    }

    public static void main(String[] args) {
        withoutStream();
        withStream();




    }


}
