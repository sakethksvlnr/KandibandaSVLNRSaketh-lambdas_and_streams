package Stream_API.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/***
 * filtering Collection by using Stream
 *
 *
 *
 */

public class JavaStreamExample {

    private static List<Product> productsList = new ArrayList<Product>();

    static {
                     // Adding Products
                     productsList.add(new Product(1, "HP Laptop", 25000f));
                     productsList.add(new Product(2, "Dell Laptop", 30000f));
                     productsList.add(new Product(3, "Lenevo Laptop", 28000f));
                     productsList.add(new Product(4, "Sony Laptop", 28000f));
                     productsList.add(new Product(5, "Apple Laptop", 90000f));
           }

    public static void main(String[] args) {
        withStreamAPI();
    }

    private static void withStreamAPI() {
        // filtering data of list
        List<Float> productPriceList = productsList.stream()
                .filter((product) -> product.getPrice() > 25000) // filtering data
                .map((product) -> product.getPrice())    // fetching price
                .collect(Collectors.toList()); // collecting as list
        // displaying data
        productPriceList.forEach((price) -> System.out.println(price));
    }



}
