package javaBasic;

public class Strings {

	public static void main(String[] args) {
		
		
	String str1 = "Hello";
	String str2 = "There";
	
	if( str1.equals("Hello") ) { // user equals() to compare strings
		System.out.println(true);
	}
	
	if( str2.equalsIgnoreCase("THERE") ) { //user equalesIgnoreCase(); to ignore upper & lower cases characters.
		System.out.println(true);
	}

	}

}
