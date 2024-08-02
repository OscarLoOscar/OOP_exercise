package exercise1;

public class Food extends Product {

  public Food(String name, double price) {
    super(name, price, ProductCategory.FOOD);
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
