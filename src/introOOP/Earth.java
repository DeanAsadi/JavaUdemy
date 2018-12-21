package introOOP;

public class Earth {

	public static void main(String[] args) {
		
		Human tom;
		tom = new Human();
		
		tom.name = "Tom";
		tom.age = 32;
		tom.height = 6;
		tom.eyeColor = "Brown";
		
		tom.speak();
	}

}
