import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Shop walmart = new Shop();
    static String selection;

    public static void customerMessage(){
        do{
            String optionsMessage = "Please select one from the following:" + "\nA: To create a new product \n" + "B: To read all products \n" + "C: To update a product \n" + "D: To delete a product \n" + "E: To quit \n";
            System.out.println(optionsMessage);
            selection = scan.nextLine();

            if(selection.equals("A")){
                walmart.createProduct();

            }else if(selection.equals("B")){
                walmart.printProducts();

            }else if(selection.equalsIgnoreCase("C")){
                walmart.updateProduct();

            }else if(selection.equalsIgnoreCase("D")){
                walmart.deleteProduct();

            }else if(selection.equals("E")){
                System.out.println("See you soon!");

    }
        }while(selection.equals("E") == false);
    }
    public static void main(String[] args) {
        //call the create method
//        walmart.createProduct();
//        walmart.printProducts();
//        walmart.updateProduct();

        customerMessage();
    }
}
