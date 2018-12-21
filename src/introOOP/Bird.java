package introOOP;

public class Bird extends Zoo {
	
	
	
	public Bird( String name, String run, String fly, String eat, String sleep ) {
		super( name, run, fly, eat, sleep );
	}
	
	public void birdy() {
		System.out.println( name + " is an animal that " + run + fly + " his fave food is " + eat + " and he sleeps at " + sleep);

	}
	
}


// Note : when you extend from class, default constructor won't work anymore, it will be different & must include super()
