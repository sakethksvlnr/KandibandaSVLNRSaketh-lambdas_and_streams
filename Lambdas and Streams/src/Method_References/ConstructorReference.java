package Method_References;

public class ConstructorReference {


    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }

}
