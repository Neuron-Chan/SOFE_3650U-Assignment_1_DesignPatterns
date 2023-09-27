package abstractFactory;

public interface GroceryProductFactory {
	public GroceryProduct getProduct();
	public double getPrice(String product);
	public String getProductPrice();
	
}
