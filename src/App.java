import java.util.ArrayList;
import java.util.List;
import exercise1.Clothing;
import exercise1.DiscountCode;
import exercise1.Electronics;
import exercise1.Food;
import exercise1.Product;
import exercise2.Customer;
import exercise4.CustomerManager;
import exercise4.Order;

public class App {
 public static void main(String[] args) {
        // Create products
        Product laptop = new Electronics("Laptop", 999.99);
        Product tShirt = new Clothing("T-Shirt", 19.99);
        Product apple = new Food("Apple", 0.99);

        // Create customers
        Customer john = new Customer("John");
        Customer alice = new Customer("Alice");

        // Create orders
        Order johnOrder = new Order(john);
        Order aliceOrder = new Order(alice);

        // Add products to John's order
        johnOrder.getItems().addProduct(laptop, 1);
        johnOrder.getItems().addProduct(tShirt, 2);

        // Add products to Alice's order
        aliceOrder.getItems().addProduct(laptop, 1);
        aliceOrder.getItems().addProduct(apple, 5);

        // Print initial order details
        System.out.println("John's initial order:");
        System.out.println(johnOrder.getItems());
        System.out.println("Total: $" + johnOrder.getFinalAmount());

        System.out.println("\nAlice's initial order:");
        System.out.println(aliceOrder.getItems());
        System.out.println("Total: $" + aliceOrder.getFinalAmount());

        // Apply discounts
        System.out.println("\nApplying discounts:");
        double johnDiscounted = johnOrder.applyDiscounts(DiscountCode.DISCOUNT20);
        double aliceDiscounted = aliceOrder.applyDiscounts(DiscountCode.FOOD20);

        System.out.println("John's discounted total: $" + johnDiscounted);
        System.out.println("Alice's discounted total: $" + aliceDiscounted);

        // Create a list of orders for each customer
        List<Order> johnOrders = new ArrayList<>();
        johnOrders.add(johnOrder);

        List<Order> aliceOrders = new ArrayList<>();
        aliceOrders.add(aliceOrder);

        // Update member types
        CustomerManager customerManager = new CustomerManager();
        customerManager.updateMemberType(john, johnOrders);
        customerManager.updateMemberType(alice, aliceOrders);

        // Print final customer status
        System.out.println("\nFinal customer status:");
        System.out.println("John's member type: " + john.getMemberType());
        System.out.println("Alice's member type: " + alice.getMemberType());

        // Create a new order for John to potentially upgrade his status
        Order johnSecondOrder = new Order(john);
        johnSecondOrder.getItems().addProduct(laptop, 5);  // Adding 5 laptops to potentially exceed GOLD_THRESHOLD
        johnSecondOrder.applyDiscounts(DiscountCode.PRODUCT10);
        johnOrders.add(johnSecondOrder);

        // Update John's member type again
        customerManager.updateMemberType(john, johnOrders);

        System.out.println("\nJohn's updated member type after second order: " + john.getMemberType());
    }
}
