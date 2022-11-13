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
//        Main.customerMessage();
    }

    //creating "create" method for crud
    public void createProduct() {
//        System.out.println("Would you like to create more product?");
//        System.out.println("true or false");
//        String choose = scan.nextLine();
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

            products.put(id, items);

//            products.toString()
            printProducts();
            Main.customerMessage();
//            System.out.println("Would you like to create more product?");
//            System.out.println("true or false");
//            choose = scan.nextLine();
//            updateProduct();


        }
    }

    public void updateProduct() {
        this.printProducts();
        System.out.println("Please enter the ID for the product you want to update");
        int pID = scan.nextInt();
        for (Products products : products.values()) {
            if (pID == products.id) {
                System.out.println("What is the new name of your product?");
                scan.nextLine();
                products.name = scan.nextLine();

                System.out.println("Describe your product?");
                products.description = scan.nextLine();

                System.out.println("what is the new price?");
                products.price = Double.valueOf(scan.nextLine());

                System.out.println("what is the product id?");
                products.id = scan.nextInt();
                scan.nextLine();

                System.out.println("Is the product in stock?");
                products.inStock = Boolean.valueOf(scan.nextLine());

            }
        }
        printProducts();
        Main.customerMessage();

    }

    public void deleteProduct() {
        printProducts();
        System.out.println("Please enter the ID for the product you want to delete");
        int pID = scan.nextInt();
        products.remove(pID);
//        for (Products x : products.values()) {
//            if (pID == x.id ) {
//                products.remove(x);
//            }
//        }
        printProducts();
        Main.customerMessage();
    }

}
