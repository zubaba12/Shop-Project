import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    HashMap<String, Products> products = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public void printProducts(){
        System.out.println("Here are your products: ");
        for (Products products: products.values()) {
            products.toString();
        }
        public void CreateProduct(){

        }
    }
}
