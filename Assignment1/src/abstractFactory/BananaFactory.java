import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

package abstractFactory;

public class BananaFactory implements GroceryProductFactory {

	@Override
	public GroceryProduct getProduct() {
		
		GroceryProduct a = new Banana();
		a.setPrice(productPrice);
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
					
				}else if (!reader.hasNextLine()){
					
				}
			}
		} catch{

		}
	}
}
