package hashMapFunctions;//created package as hashMapFunctions

import java.util.HashMap;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//hashmap contains values based on keys
import java.util.Iterator;//iterator is an interface,used to iterator collection of objects

public class HashMapComparator {//created class as HashMapComparator
	                             //classes are the basics of oops(object oriented programming language)

	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>(); 
		// Adding values to HashMap as ("keys", "values")

		 hashmap.put(1,"Micromax");//adding micromax
		 hashmap.put(3,"Lg");//adding Lg
		 hashmap.put(4,"Sony");//adding Sony
		 hashmap.put(5,"Samsung");//adding Samsung
		 hashmap.put(6,"TCL p-Series");//adding TCL p-Series
		//displays the set of hashMap 
		 System.out.println("HDTV objects are:");//system is used to return code
	       //out is a static member
	       //println is used to print text and gives output
		 //creates an object 
			Iterator valueIterator=hashmap.values().iterator();//using iterator interface
			while(valueIterator.hasNext())//using while loop
			{
				System.out.println(valueIterator.next());//system is used to return code
			       //out is a static member
			       //println is used to print text and gives output	
			
			}
			//it will place the values in 
		 hashmap.put(2,"Sony Bravia");
		 System.out.println("\nHDTV objects are:");//system is used to return code
	       //out is a static member
	       //println is used to print text and gives output
			Iterator valueIterator1=hashmap.values().iterator();
			while(valueIterator1.hasNext())//using while loop
			{
				System.out.println(valueIterator1.next());//system is used to return code
			       //out is a static member
			       //println is used to print text and gives output	
			
			}
			
		
		 String val=hashmap.get(4);//tries to get the value 4
		 System.out.println("\nThe value mapped to key 1 is:"+val);//prints
	
		 String val2=hashmap.get(7);//tries to get the value 7
		 System.out.println("\nThe value mapped to key 7 is:"+val2);//system is used to return code
	       //out is a static member
	       //println is used to print text statement of above and gives output
		 
		 
		 System.out.println("\nhashmap:");//prints hashmap
		 System.out.println(hashmap);//system is used to return code
	       //out is a static member
	       //println is used to print text and gives output
		 System.out.println("\nclear hashmap:");
		 hashmap.clear();//clears the hash map
		 System.out.println("After clearing hasmap:");
		 System.out.println(hashmap);//system is used to return code
	       //out is a static member
	       //println is used to print text and gives output
	
	
	
	}

}
