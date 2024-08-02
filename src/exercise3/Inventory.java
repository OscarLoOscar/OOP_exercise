package exercise3;

public interface Inventory<T>{
  void addProduct(T product , int quantity);
  void removeProduct(T product , int quantity);
  int getProductStock(T product);
  double totalPrice();
}
