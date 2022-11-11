//import hashmap to store data
import java.util.HashMap;
//import scanner to get user inputs
import java.util.Scanner;

//create class shop to manage products
public class Shop {
    //initializing hashmap with key value pair string and product
    HashMap<String, Products> products = new HashMap<>();
    //initializing scanner with variable scan
    Scanner scan = new Scanner(System.in);

    //creating print method to print products
    public void printProducts() {
        System.out.println("Here are your products: ");
        for (Products products : products.values()) {
            products.print();
        }
    }
    //creating "create" method for crud
    public void createProduct(){
        while (true) {
            System.out.println("What is the name of your product?");
            String name = scan.nextLine();
            System.out.println("Describe your product?");
            String description = scan.nextLine();
            System.out.println("what is the price?");
            double price = Double.valueOf(scan.nextLine());
            System.out.println("what is the product id?");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Is the product in stock?");
            boolean inStock = Boolean.valueOf(scan.nextLine());

            Products items = new Products(name, description, price, id, inStock);

            products.put(String.valueOf(id), items);

//            products.toString()
            printProducts();

            }
        }
}
