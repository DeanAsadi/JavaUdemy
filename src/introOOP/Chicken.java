package introOOP;

public class Chicken extends Bird {
	
	public Chicken( String name,  String eat, String sleep ) {
		super( name, eat, sleep );
		
	}
	
	
//	//Overriding fly() in Bird, because Chicken can't fly
//	public void fly() {
//		System.out.println("flying..."); // It's been commented out, because we used INTERFACE instead.
//	}

}
