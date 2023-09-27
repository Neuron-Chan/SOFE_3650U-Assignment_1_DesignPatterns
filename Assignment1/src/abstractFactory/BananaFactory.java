package abstractFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BananaFactory implements GroceryProductFactory {

GroceryProduct a = new Banana();
	
	public GroceryProduct getProduct() {
	
		a.setPrice(getPrice("Banana"));
		
		return a;
	}

	public double getPrice(String product){
		
		double value = 0;
		
		try{
			File file = new File("datafile.txt");
			Scanner reader = new Scanner(file);
			
			
			while (true){
				
				String price = reader.nextLine();
				
				if(price.contains(product) ){
					int index = price.indexOf(' ');
					String temp = price.substring(index);
					value = Double.parseDouble(temp);
					reader.close();
					System.out.println("An Banana has been created.");
					break;	
				}
			}
		} catch (FileNotFoundException e){
			System.out.println("An Banana has not been created.");
			System.out.println("Data File not found");
		}
		return value;
	}
	
	public String getProductPrice() {
		String out = a.getPrice()+"";
		return out;
	}
}
