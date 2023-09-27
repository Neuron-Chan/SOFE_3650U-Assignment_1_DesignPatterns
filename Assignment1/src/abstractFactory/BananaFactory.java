package abstractFactory;

public class BananaFactory extends AbstractFactory implements GroceryProductFactory {

	@Override
	public GroceryProduct createProduct(double productPrice) {
		
		GroceryProduct a = new Banana();
		a.setPrice(productPrice);
		System.out.println("An Banana has been created.");
		
		return a;
	}
	
}
