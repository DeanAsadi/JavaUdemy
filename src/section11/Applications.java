package section11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Applications {

	public static void main(String[] args) {
		
// __________________________________________________________ArrayList - Collectin 		
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
		
		
// __________________________________________________________LinkedList - Collectin 	
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
		
		
// __________________________________________________________HashSet 
		
		HashSet <Integer> values = new HashSet<Integer>(); // This collection type will print values randomly
		
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(6);
		values.add(6);
		
		for ( int value: values  ) {
			System.out.println(value);
		}
	
// __________________________________________________________LinkedHashSet
		
		LinkedHashSet <Integer> values1 = new LinkedHashSet<Integer>(); // This collection type will print the values in order without reapition
			
			values1.add(41);
			values1.add(51);
			values1.add(61);
			values1.add(61);
			values1.add(612);
			
			for ( int value: values1  ) {
				System.out.println(value);
				}
			
// __________________________________________________________HashSet/ Animals
			
			HashSet<Animals> animal = new HashSet<Animals>();
			Animals animals1 = new Animals ( "Bear", 6 );
			Animals animals2 = new Animals ("Lion", 10);
			Animals animals3 = new Animals ("Lion", 10);
			
			animal.add(animals1);
			animal.add(animals2);
			animal.add(animals3);
			
			for (Animals val: animal) {
				System.out.println(val);
			}
			
			// After generating hashCode() in Animals class, now this will evaluate to true, without it will eval to false
			System.out.println(animals2.hashCode() == animals3.hashCode());
			}

		}
