package section11;

import java.util.ArrayList;

public class Applications {

	public static void main(String[] args) {
		
		//Collection type ArryList
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("There");
		words.add("Everyone");
		
		String item1 = words.get(2); // To get the second elelemnt in "words"
		System.out.println(item1);
		
		
	}

}
