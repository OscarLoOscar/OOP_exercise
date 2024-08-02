package exercise4;

import java.math.BigDecimal;
import java.util.List;
import exercise2.Customer;
import exercise2.MemberType;

public class CustomerManager {
    private static final BigDecimal SILVER_THRESHOLD = new BigDecimal("1000");
    private static final BigDecimal GOLD_THRESHOLD = new BigDecimal("5000");

    public void updateMemberType(Customer customer,
            List<Order> customerOrders) {
        BigDecimal totalOrderSize = calculateTotalOrderSize(customerOrders);
        MemberType currentType = customer.getMemberType();
        MemberType newType;

        if (totalOrderSize.compareTo(GOLD_THRESHOLD) >= 0) {
            newType = MemberType.GOLD;
        } else if (totalOrderSize.compareTo(SILVER_THRESHOLD) >= 0) {
            newType = MemberType.SILVER;
        } else {
            newType = MemberType.REGULAR;
        }

        if (newType.ordinal() > currentType.ordinal()) {
            customer.setMemberType(currentType.upgrade());
            System.out.println(customer.getName() + " has been upgraded to "
                    + customer.getMemberType());
        } else if (newType.ordinal() < currentType.ordinal()) {
            customer.setMemberType(currentType.downgrade());
            System.out.println(customer.getName() + " has been downgraded to "
                    + customer.getMemberType());
        }
    }

    private BigDecimal calculateTotalOrderSize(List<Order> orders) {
        return orders.stream()
                .map(order -> BigDecimal.valueOf(order.getFinalAmount()))//
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
