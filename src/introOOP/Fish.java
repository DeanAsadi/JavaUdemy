package introOOP;

public class Fish extends Zoo {
	
	public Fish( String name, String run, String fly, String eat, String sleep  ) {
		super( name, run, fly, eat, sleep );
		
	}
	
	public void fishy() {
		System.out.println( name + " is an animal that " + run + fly + " his fave food is " + eat + " and he sleeps at " + sleep);

	}

}
