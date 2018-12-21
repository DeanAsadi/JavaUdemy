package introOOP;

public class Bird extends Zoo {
	
	
	
	public Bird( String name, String eat, String sleep ) {
		super( name,  eat, sleep );
	}
	
	public void fly() {
		System.out.println( name + " is an animal that " + " his fave food is " + eat + " and he sleeps at " + sleep);

	}
	
}


// Note : when you extend from class, default constructor won't work anymore, it will be different & must include super()
