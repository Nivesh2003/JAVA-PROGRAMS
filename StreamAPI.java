import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPI {
        String name;
        double price;
        String category;
    
        // Constructor
        public StreamAPI(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }
    
        // Getters
        public String getName() {
            return name;
        }
    
        public double getPrice() {
            return price;
        }
    
        public String getCategory() {
            return category;
        }
    
        @Override
        public String toString() {
            return  "StreamAPI{name='" + name + "', price=" + price + ", category='" + category + "'}";
        }
    public static void main(String[] args) {
        List<StreamAPI> productList = Arrays.asList(
            new StreamAPI("Laptop", 1200, "Electronics"),
            new StreamAPI("Phone", 800, "Electronics"),
            new StreamAPI("Shirt", 50, "Clothing"),
            new StreamAPI("TV", 1500, "Electronics"),
            new StreamAPI("Jeans", 60, "Clothing"),
            new StreamAPI("Refrigerator", 2000, "Appliances")
    );
    // Task 1: Find all products with price greater than 1000
        List<StreamAPI> expensiveProducts = productList.stream()
                .filter(product -> product.getPrice() > 1000)
                .collect(Collectors.toList());
        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(System.out::println);

        // Task 2: Calculate total price of all products
    double totalPrice = productList.stream()
    .mapToDouble(StreamAPI::getPrice)
    .sum();
System.out.println("Total Price of all products: " + totalPrice);

   // Task 3: Find the product with the highest price
   StreamAPI mostExpensiveProduct = productList.stream()
   .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
   .orElse(null);
System.out.println("Most expensive product: " + mostExpensiveProduct);

// Task 4: Create a list of product names sorted alphabetically
List<String> sortedProductNames = productList.stream()
.map(StreamAPI::getName)
.sorted()
.collect(Collectors.toList());
System.out.println("Product names sorted alphabetically:");
sortedProductNames.forEach(System.out::println);

    }
 }
    

