package javaBasic;

public class Methods {
	public static void main(String[] args) {
		//------------------------------------------------------------------------------

		// We're invoking testMethod from MyUtils class
		MyUtils.testMethod( " Passing arguments here :) " );// Calling Method here...
		// Will call the testMethod( String str ) not testMethod( int integer ) 
		//------------------------------------------------------------------------------

		MyUtils.addNums( 1, 2 ); // invoking addNums() from MyUtils class, into "main" method
		System.out.println( 1 + 2 );
		
		//------------------------------------------------------------------------------
		MyUtils.addString(" A Sting from addString method, in MyUtils class");
		// We can capture the return in a variable, (We can only do that we we return int method.
		String myStr = MyUtils.addString(" A Sting from addString method, in MyUtils class");
		System.out.println(myStr);
		//------------------------------------------------------------------------------

	}
	
	
}
