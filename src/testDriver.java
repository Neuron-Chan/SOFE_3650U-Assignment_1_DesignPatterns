import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import abstractFactory.ApplesFactory;
import abstractFactory.BananasFactory;
import abstractFactory.GroceryProduct;
import abstractFactory.GroceryProductFactory;

public class testDriver {
	
	public static void main(String[] args) {
		
		//Debug to know which directory Java is referencing upon file read
		System.out.println("Current Working DIR: " + System.getProperty("user.dir"));

		//Definitions of concrete factories:
		GroceryProductFactory apple = new ApplesFactory();
		GroceryProductFactory banana = new BananasFactory();
		
		ArrayList<String> readLines = new ArrayList();

		try { //Read File & Scan
		 	File myObj = new File("src/test.txt");
			Scanner myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				readLines.add(data);
			}

			myReader.close();

		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		      
		      
		      
		   
		 
		    //Products with Factories:
        for(int i = 0; i < readLines.size(); i++) {
	    	  
		        String[] parts = readLines.get(i).split(" ");
		        
		        String productName = parts[0];
		        float productValue = Float.parseFloat(parts[1]);
		        
		        if(productName.equals("Apples")) 
            { // apple factory created
		        	GroceryProduct apples = apple.createProduct(productValue);
		        }
		        
		        else if(productName.equals("Bananas")) 
            { // banana factory created
		        	GroceryProduct bananas = banana.createProduct(productValue);
		        } 
            else 
            {
		        	System.out.println("GroceryProduct: "+productName+" does not exist; invalid token");
		        }
	      }
		
	}


}
