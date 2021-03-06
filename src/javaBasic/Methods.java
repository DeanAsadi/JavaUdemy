package javaBasic;

public class Methods {
	public static void main(String[] args) {
		//------------------------------------------------------------------------------

		// We're invoking testMethod from MyUtils class
		MyUtils.testMethod( " Passing arguments here :) " );// Calling Method here...
		// Will call the testMethod( String str ) not testMethod( int integer ), because we have string as argument :)
		//------------------------------------------------------------------------------

		MyUtils.addNums( 1, 2 ); // invoking addNums() from MyUtils class, into "main" method
		System.out.println( 1 + 2 );
		
		//------------------------------------------------------------------------------
		MyUtils.addString(" A Sting from addString method, in MyUtils class");
		// We can capture the return in a variable, (We can only do that we we return int, or any DATA TYPE methods.
		String myStr = MyUtils.addString(" A Sting from addString method, in MyUtils class") + 10;
		System.out.println(myStr);
		//------------------------------------------------------------------------------

	}
	
}
