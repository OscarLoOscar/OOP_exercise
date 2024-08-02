package exercise3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import exercise1.Product;

public class ShoppingCart<T extends Product> implements Inventory<T> {
  private HashMap<T, Integer> items = new HashMap<>();

  public HashMap<T, Integer> getItems() {
    return this.items;
  }

  @Override
  public void addProduct(T product, int quantity) {
    items.put(product, items.getOrDefault(product, 0) + quantity);
  }

  @Override
  public void removeProduct(T product, int quantity) {
    int currentStock = items.getOrDefault(product, 0);
    if (currentStock >= quantity)
      items.put(product, currentStock - quantity);
    else
      throw new IllegalArgumentException("Not Enough Stock");
  }

  @Override
  public int getProductStock(T product) {
    return items.getOrDefault(product, 0);
  }

  @Override
  public double totalPrice() {
    BigDecimal totalPrice = BigDecimal.ZERO;
    BigDecimal calculate = BigDecimal.ZERO;
    for (Map.Entry<T, Integer> entry : this.items.entrySet()) {
      BigDecimal price = BigDecimal.valueOf(entry.getKey().getPrice());
      BigDecimal quantity = BigDecimal.valueOf(entry.getValue());
      calculate = price.multiply(quantity);
      totalPrice = totalPrice.add(calculate);
    }
    return totalPrice.doubleValue();
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ShoppingCart:\n");
    for (Map.Entry<T, Integer> entry : items.entrySet()) {
      T product = entry.getKey();
      Integer quantity = entry.getValue();

      sb.append(product.getName())//
          .append(" (")//
          .append(product.getProductCategory())//
          .append("): ")//
          .append(quantity)//
          .append(" in cart\n");//
    }
    return sb.toString();
  }
}
