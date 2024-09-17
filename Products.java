 /* A Java program to model a simple e-commerce system. A base class Product with common properties and
 methods for all types of products,  two subclasses ElectronicsProduct and ClothingProduct that inherit
 from the base class. Implemented method overriding to calculate discounts for different types of products. */
 
 class Product {
    //Properties
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize properties
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

   
    public int getQuantity() {
        return quantity;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateDiscount() {
        return 0.0; // Base class does not calculate discount
    }
}

class ClothingProduct extends Product {

    public ClothingProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }
}
class ElectronicProduct extends Product {

    public ElectronicProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.30;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        // Create ElectronicsProduct
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.00, 5);
        System.out.println("Discount: Rs." + laptop.calculateDiscount());

        // Create ClothingProduct
        ClothingProduct shirt = new ClothingProduct("Shirt", 50.00, 10);
        System.out.println("Discount: Rs." + shirt.calculateDiscount());
    }
}