package introOOP;

public class Fish extends Zoo {
	
	public Fish( String name,  String eat, String sleep  ) {
		super( name, eat, sleep );
		
	}
	
	public void fishy() {
		System.out.println( name + " is an animal that " + " his fave food is " + eat + " and he sleeps at " + sleep);

	}

}

// Override : we're replacing a method that we are inheriting form a class
// If chkn inherit from Bird class, "Ckn" can't fly, so we define a fly() method in chkn class to override the fly() in Bird class.
// Another way of solving the problem is to, delete the fly() and replace it with an "INTERFACE"

// INTERFACE : Is a contract, any class that want to implement that "interface" , the class must promise to use that method.
// INTERFACE : Should be named after the functionality that we're trying to abstract away