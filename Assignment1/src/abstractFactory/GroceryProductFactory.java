package abstractFactory;

public interface GroceryProductFactory {
	public Apples createApple():
	public Banana createBanana();
	public GroceryProduct createProduct(double productPrice);
	
}
