package exercise1;

public class Clothing extends Product {

  public Clothing(String name, double price) {
    super(name, price, ProductCategory.CLOTHING);
  }

  @Override
  public boolean updateStock(int newStock) {
    if (newStock >= 0) {
      this.setStock(newStock);
      return true;
    }
    return false;
  }

}
