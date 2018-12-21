package javaBasic;

public class Strings {

	public static void main(String[] args) {
		
		
	String str1 = "Hello";
	String str2 = "There";
	String str3 = "hello there programmer";
	
	if( str1.equals("Hello") ) { // user equals() to compare strings
		System.out.println(true);
	}
	
	if( str2.equalsIgnoreCase("THERE") ) { //user equalesIgnoreCase(); to ignore upper & lower cases characters.
		System.out.println(true);
	}
	
	System.out.println(str1.charAt(1)); // charAt();
	
	System.out.println(str3.indexOf("there")); // indexOf : "RETURNS" -1 IF NOT FOUND indexOf("there", 3); start searching for "there" starting from index 3
	
	System.out.println(str3.lastIndexOf("programmer")); // Starts from right to left,

	}

}
