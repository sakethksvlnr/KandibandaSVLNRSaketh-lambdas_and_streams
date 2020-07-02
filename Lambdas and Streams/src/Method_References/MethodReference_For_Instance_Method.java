package Method_References;

public class MethodReference_For_Instance_Method {


    public void hellop(){
        System.out.println("Hello from instance method.....");
    }



    public static void main(String[] args) {


        MethodReference_For_Instance_Method instance_method = new MethodReference_For_Instance_Method();

        Sayable2 sayable2 = instance_method::hellop;
        sayable2.say();


    }





}
