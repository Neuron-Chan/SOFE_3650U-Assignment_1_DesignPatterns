import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

package abstractFactory;

public class BananaFactory implements GroceryProductFactory {

	String productType = "Banana";
	
	@Override
	public GroceryProduct getProduct() {
		
		GroceryProduct a = new Banana();
		a.setPrice(product);
		System.out.println("An Banana has been created.");
		
		return a;
	}

	public double getPrice(String product){
		double value;
		try{
			File file = new File("datafile.txt");
			Scanner reader = new Scanner(file);
			
			while (true){
				String price = reader.nextLine();
				if(price.contains(product) ){
					int index = price.indexOf(' ');
					index--;
					String temp = price.substring(index);
					value = Double.parseDouble(temp);
					reader.close();
					break;	
				}
			}
		} catch (FileNotFoundException e){
			System.out.println("Data File not found");
		}
	}
}
