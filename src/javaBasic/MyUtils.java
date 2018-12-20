package javaBasic;

public class MyUtils {
	
	public static void testMethod( String str ) { //Method signature 
		System.out.println(" Printing a test, " + str); //Method body
	}
	public static void testMethod( int integer ) {
		System.out.println(" Printing a test, " + integer);
	}
	public static int addNums( int num1, int num2 ) {
		return num1 + num2;
		
	}
	public static String  addString( String str ) { // To return you have to replace void with the DATA TYPE you're declaring.
		return str;
	}
	public  int addMoreNums( int num1, int num2 ) { //removing static, and access this method with class instance, in ClassVisibility class.
		return num1 + num2;
	}

}


// public : Access modifier (To manage visibility of methods and variables) to the entire project "javaBasic"
//private : Locally in this class, it can't be used in another class.
// static : by declaring static, we are making these methods accessible to the class
// static : if we remove "static", the methods will belong to the instance of the class.
