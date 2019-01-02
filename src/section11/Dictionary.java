package section11;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	public static void main( String[] args  ) {
		
			HashMap <String, String> dictionary = new HashMap<String, String>();
			
			dictionary.put("Brave", "Ready to face and endure danger or pain; showing courage");
			dictionary.put( "Brilliant", "Exceptionaly cleaver or talented." );
			dictionary.put("Joy", "A feeling of great pleasure and happiness");
			
			for ( String word: dictionary.keySet() ) {
				System.out.print(word + ": "); // 
				System.out.println( dictionary.get(word) ); //
				
			}
			
			//Another way of looping to gey keys and values: 
			for ( Map.Entry<String, String> entry : dictionary.entrySet()) {
				System.out.println( entry.getKey() );
				System.out.println( entry.getValue() );
			}
			for ( Map.Entry<String, String> entry : dictionary.entrySet()) {
				System.out.println( entry.getKey() );
				
			}
		
	}

}
