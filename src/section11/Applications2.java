package section11;

import java.util.ArrayList;
import java.util.Collections;

public class Applications2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		ArrayList<Employee2> employeeList = new ArrayList<Employee2>();
		
		employeeList.add( new Employee2( "Mike", 1000, "IT" ) );
		employeeList.add( new Employee2( "Dean", 100000, "Software" ) );
		employeeList.add( new Employee2( "Asadi", 250000, "Senior software namager" ) );
		
			
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(15);
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.add(20);
		newList.add(30);
		
	
		
		list1.addAll(newList);
		
		// Sort Array
		Collections.sort(list1);
		System.out.println(list1);
		
		
		// Add all values from ArrayList to another
		System.out.println(list1);
		
		//Remove all newList values from list1
		list1.removeAll(newList);
		System.out.println(list1);
		
		//Delete all values from list1
		list1.clear();
		System.out.println(list1);
		
		//Find if the list contain() a specific value.
		boolean findValue = list1.contains( 55);
		System.out.println(findValue);
		
		//Find if the Array is Empty or not.
		boolean isEmpty = list1.isEmpty();
		System.out.println(isEmpty);
		
		// retain All 
		list1.retainAll(newList);
		System.out.println( list1);
		
				
		
	}

}
