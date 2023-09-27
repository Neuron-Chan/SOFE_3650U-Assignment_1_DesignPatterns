public class FactoryGenerator {
 
  GroceryProductFactory factory;
	
	public GroceryProductFactory getFactory(String product) {
		if(product == "Apple") {
			
			factory = new AppleFactory();
			factory.getProduct();
			
			return factory;
			
		}else if(product == "Banana") {
			
			factory = new BananaFactory();
			factory.getProduct();
			
			return factory;
		}
		
		return factory;
	}
}
