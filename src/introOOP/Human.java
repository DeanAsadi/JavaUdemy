package introOOP;

public class Human {
	
	String name;
	int age;
	int height;
	String eyeColor;
	
	String name2;
	int age2;
	String food;
	String walk;
	
	
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
	public void person() {
		System.out.println( " I'd like to intreduce myself, my name is "  + name2  + " I am " + age2);
	}
	public void walking() {
		System.out.println( "I like to walk " + walk + " a lot specialy after eating " + food );
	}

}




//This class will allow us to create object of type Human.
// Classes, contain instruction for "how should the object behave in the application"
//constructor : Provides a way to construct objects
//constructor : they alway's have the same name as your class they belong in.