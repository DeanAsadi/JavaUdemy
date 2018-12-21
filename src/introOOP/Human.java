package introOOP;

public class Human {
	
	String name;
	int age;
	int height;
	String eyeColor;
	
	public Human() {
		
	}
	
	public void speak() {
		
		System.out.println(" Hi, my name is " + name);
		System.out.println(" I am  " + age +  "  years old");
		System.out.println(" and " + height + " tall" );
		System.out.println(" also my eye color is " + eyeColor);


	}
	public void eat() {
		System.out.println(" I like to eat Sushi");

	}
	public void walk() {
		System.out.println(" and take a walk in the morning :) ");

	}

}




//This class will allow us to create object of type Human.
// Classes, contain instruction for "how should the object behave in the application"
//constructor : Provides a way to construct objects
//constructor : they alway's have the same name as your class they belong in.