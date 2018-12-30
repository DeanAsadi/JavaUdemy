package section11;

import java.util.ArrayList;

public class Applications2 {

	public static void main(String[] args) {
			
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(15);
		
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.add(20);
		newList.add(30);
		
		
		list1.addAll(newList);
		
		// Add all values from ArrayList to another
		System.out.println(list1);
		
		//Remove all newList values from list1
		list1.removeAll(newList);
		System.out.println(list1);
		
		//Delete all values from list1
		list1.clear();
		System.out.println(list1);
	}

}
