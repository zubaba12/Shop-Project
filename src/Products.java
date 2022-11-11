public class Products {
    String name;
    String description;
    double price;
    int id;
    boolean inStock;

    public Products(String name, String description, double price, int id, boolean inStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.id = id;
        this.inStock = inStock;
    }
    public void print(){
        System.out.println(this.name + " " + this.description +  " " + this.price +  " " + this.id +  " " + this.inStock);
    }

//    @Override
//    public String toString() {
//        return "Products{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                ", id=" + id +
//                ", inStock=" + inStock +
//                '}';
//    }
}
//@channel Instructions for the class hw / weekend challenge:
//        Your project must
//        utilize at least 3 classes
//        have basic CRUD functionality
//        use git for version control

//        Nice to haves:
//        Make use of an abstract class for modeling your data (make child classes that inherit)
//        Handle data serialization
//        Example:
//        Build a program for managing a Shop with different types of products (Electronics, Clothing, Toys etc) (edited)

