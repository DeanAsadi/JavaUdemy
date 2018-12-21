package introOOP;

public class Sparrow extends Bird implements Flyable  {
	
	public Sparrow( String name, String eat, String sleep) {
		super( name, eat, sleep );
	}
	
	public void fly() {
		System.out.println("Flying...");
	}
	
	

}
