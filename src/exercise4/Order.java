package exercise4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.Objects;
import exercise1.DiscountCode;
import exercise1.Product;
import exercise2.Customer;
import exercise3.ShoppingCart;

public class Order implements Comparable<Order> {
    private static int orderId;
    private Customer customer;
    private LocalDateTime orderDate;
    private ShoppingCart<Product> items;
    private double finalAmount;

    public Order(Customer customer) {
        orderId++;
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
        this.items = new ShoppingCart<>();
        this.finalAmount = this.items.totalPrice();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public ShoppingCart<Product> getItems() {
        return this.items;
    }

    public double getFinalAmount() {
        return this.finalAmount;
    }

    public void setFinalAmount(double newAmount) {
        this.finalAmount = newAmount;
    }

    public double applyDiscounts(DiscountCode discountCode) {
        BigDecimal discountPercentage = BigDecimal.ZERO;

        switch (discountCode) {
            case DISCOUNT10:
            case PRODUCT10:
                discountPercentage = new BigDecimal("0.90");
                break;
            case FOOD20:
            case DISCOUNT20:
                discountPercentage = new BigDecimal("0.80");
                break;
            case CLOTHING5:
                discountPercentage = new BigDecimal("0.95");
                break;
        }
        double finalPrice = BigDecimal.valueOf(items.totalPrice())
                .multiply(discountPercentage)//
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
        this.setFinalAmount(finalPrice);
        return this.getFinalAmount();
    }

    @Override
    public int compareTo(Order other) {
        return other.customer.getMemberType()
                .compareTo(this.customer.getMemberType());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(this instanceof Order))
            return false;
        Order order = (Order) obj;
        return orderId == order.orderId
                && Double.compare(order.finalAmount, finalAmount) == 0
                && Objects.equals(customer, order.customer)
                && Objects.equals(orderDate, order.orderDate)
                && Objects.equals(items, order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customer, orderDate, items, finalAmount);
    }

}
