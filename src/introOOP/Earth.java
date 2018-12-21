package introOOP;

public class Earth {

	public static void main(String[] args) {
		
		Human tom; // And we assign those objects to variables, and the object created when the application's run.
		tom = new Human(); // We use Human class constructor, to create human objects.
		
		tom.name = "Tom";
		tom.age = 32;
		tom.height = 6;
		tom.eyeColor = "Brown";
		
		tom.speak();
		tom.eat();
		tom.walk();
		
		
		
		Human dean = new Human();
		
		dean.name2 = "Dean";
		dean.age2 = 32;
		dean.food = "Steak";
		dean.walk = "Every day, in another word, I like to walk ";
		
		dean.person();
		dean.walking();
		
	}

}
