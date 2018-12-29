package section11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Applications {

	public static void main(String[] args) {
		
		//Collection type ArryList
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("There");
		words.add("Everyone");
		
		String item1 = words.get(2); // To get the second elelemnt in "words"
		System.out.println(item1);
		// To print the whole ArrayList using loop : 
		for ( int i = 0; i < words.size(); i++ ) {
			System.out.println( words.get(i) );
		}
		
		
		//Collection type LinkedList
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for( int num: numbers ) {
			System.out.println(num);
		}
		
		//We are creating our own datatype ---> Vehicle
		LinkedList<Vehicle> vehicles  = new LinkedList<Vehicle>();
		Vehicle vehicles1 = new Vehicle ( "Dodge", "Challenger", 12000, false );
		
		vehicles.add(vehicles1);
		vehicles.add(new Vehicle ( "Dodge1", "Challenger1", 12001, false ));
		vehicles.add( new Vehicle ( "Dodge2", "Challenger2", 12002, false ) );
		vehicles.add( new Vehicle( "Dodge3", "Challenger3", 12003, false ) );
		
		for ( Vehicle car: vehicles ) {
			System.out.println(car.getMake()); // getPrice | get fourWhealDrive | getModle
			System.out.println(car);

			
		}
		
		
	}

}
