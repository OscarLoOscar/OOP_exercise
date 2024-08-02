package exercise1;

import java.util.Objects;

public abstract class Product {
  private String name;
  private double price;
  private int stock;
  private ProductCategory category;

  public Product(String name, double price, ProductCategory category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public boolean isOutOfStock() {
    return this.getStock() == 0;
  }

  public abstract boolean updateStock(int newStock);

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public String getProductCategory() {
    return this.category.name();
  }

  public int getStock() {
    return this.stock;
  }

  public void setStock(int newStock) {
    this.stock += newStock;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  @Override
  public String toString() {
    return "Name : " + this.name + //
        ", Price : " + this.price;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Product))
      return false;
    Product product = (Product) obj;
    return Double.compare(product.price, this.price) == 0 && //
        Objects.equals(product.name, this.name) && //
        product.category == this.category;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, category);
  }
}
