//import hashmap to store data
import java.util.HashMap;
//import scanner to get user inputs
import java.util.Scanner;

//create class shop to manage products
public class Shop {
    //initializing hashmap with key value pair string and product
    HashMap<Integer, Products> products = new HashMap<>();
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
    public void createProduct() {
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

            products.put(Integer.valueOf(id), items);

//            products.toString()
            printProducts();
            updateProduct();

        }
    }

    public void updateProduct() {
        this.printProducts();
        System.out.println("Please enter the ID for the product you want to update");
        int pID = scan.nextInt();
        for (Products products : products.values()) {
            if (pID == products.id) {
                System.out.println("What is the new name of your product?");
                String name = scan.nextLine();
                System.out.println("Describe your product?");
                String description = scan.nextLine();
                System.out.println("what is the new price?");
                double price = Double.valueOf(scan.nextLine());
                System.out.println("what is the product id?");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.println("Is the product in stock?");
                boolean inStock = Boolean.valueOf(scan.nextLine());

            }
        }
        printProducts();
    }

    public void deleteProduct() {
        this.printProducts();
        System.out.println("Please enter the ID for the product you want to update");
        int pID = scan.nextInt();
        //Products deleteProduct;
        for (Integer x : products.keySet()) {
            if (x == pID) {
                this.products.remove(x);
            }
        }
    }
}
