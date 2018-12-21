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
		tom.eat();
		tom.walk();
		
		
		
		Human dean;
		dean = new Human();
		
		dean.name2 = "Dean";
		dean.age2 = 32;
		dean.food = "Steak";
		dean.walk = "Every day, in another word, I like to walk ";
		
		dean.person();
		dean.walking();
		
	}

}
