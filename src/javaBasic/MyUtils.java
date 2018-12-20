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

}


// public : Access modifire (To manage visibility of methods and variables) to the entire project "javaBasic"
//private : Locally in this class, it can't be used in another class.