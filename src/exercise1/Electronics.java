package exercise1;

public class Electronics extends Product {

	public Electronics(String name, double price) {
		super(name, price, ProductCategory.ELECTRONICS);
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
