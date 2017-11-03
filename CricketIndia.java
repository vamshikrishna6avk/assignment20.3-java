package hashMapFunctions;//created package as hashMapFunctions

/**
 * Creating a HashMap object in the Java Program and perform the following functionalities:
     Adding key-value pairs to the HashMap object.
       Adding a key-value pair to the HashMap object if the key-value pair doesn’t exist already.
         Retrieving a value associated with a given key from the HashMap.
            Clearing all the key-value pair present in the HashMap.
 */
import java.util.HashMap;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//hashmap contains values based on keys
import java.util.Map;//map provides methods for storing values baes on key basis
public class CricketIndia {  //Creates class name as CricketIndia
	public static void main(String[] args) { //Main class
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method,and to display
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
		//Creating HashMap object 
		HashMap<String, String> hashObj = new HashMap<String, String>();
		
		//Adding Key Value into the hashMap . 
		hashObj.put("Player", "uday");
		hashObj.put("Age", "29");
		
		for (Map.Entry<String, String> hash1 : hashObj.entrySet()) { // Prints all key-value pairs in the hashMap table 
			System.out.println(hash1.getKey() + " " + hash1.getValue());//system is used to return code
		       //out is a static member
		       //println is used to print text and gives output
		}
		
		String key = "Name"; // Declaring variables 
		String value = "32";//variables key as Name,values as 32
         
		// Checks weather a key-value pair exists or not ?
		String resultKey = hashObj.containsKey(key) ? (hashObj.get(key)) : ("\nKey (" + key + ") doesn't exist.");
		log(resultKey); //Calling Log method 
		String resultValue = hashObj.containsValue(value) ? ("Value (" + value + ") exist.")
				: ("Value (" + value + ") doesn't exist.\n");
		log(resultValue);//resultValue

		// Getting the value associated with the given key .
		System.out.println("Value associated with a given key is: " + hashObj.get("Player"));//system is used to return code
	       //out is a static member
	       //println is used to print above text and gives output

		// Deleting all the key-value pair from the HashMap.
		hashObj.clear();
		System.out.println("\nAll the key-value pairs are removed from the HashMap.");//system is used to return code
	       //out is a static member
	       //println is used to print above text and gives output

	}

	private static void log(Object object) {  //Creates method 
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				
		System.out.println(object);//system is used to return code
	       //out is a static member
	       //println is used to print text and gives output

	}

}