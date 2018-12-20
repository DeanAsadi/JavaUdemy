package checkClassVisibility;

import javaBasic.MyUtils; // Importing folder, then class. Then you can use that class public methods.
// If it belongs to the same package, we don't need to import the class :)

public class ClassVisibility {

	public static void main(String[] args) {
		
//		System.out.println(MyUtils.addNums(1, 2));
	}
	public static void accessStatic() {
		MyUtils myVar;
		myVar  = new MyUtils(); // myVar:  is class instance for MyUtils.
		// we can used it to access methods without "STATIC"
		
		System.out.println(myVar.addMoreNums(1, 2));
	}

}

