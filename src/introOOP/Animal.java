package introOOP;

public class Animal {

	public static void main(String[] args) {
		
		Zoo bat = new Zoo( "Bat", "dosen't run, ", "but it can fly", "blood", " at night." ) ;
		Zoo tiger = new Zoo("Tiger", " dosen't fly, ", " but it can run", " meat", " in the morning.");
		
		bat.specs();
		tiger.specs();

	}

}
