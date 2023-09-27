public class FactoryTest{
  
  public static void main(String args[]) {
		GroceryProductFactory appleFactory;
		GroceryProductFactory bananaFactory;
		FactoryGenerator gen = new FactoryGenerator();
		
		
		appleFactory = gen.getFactory("Apple");
		
		bananaFactory = gen.getFactory("Banana");
		
		System.out.println("The price for a Apple is: $" + appleFactory.getProductPrice());
		
		System.out.println("The price for a Banana is: $" + bananaFactory.getProductPrice());
	}

}
