package processingFiles;

// We created this file as Exception.
public class MyFileUtils {
	public int myFirstExceptionMethod( int number ) throws Exception {
		
		if( number < 10 ) {
			throw new Exception (" The number passed in was smaller then 10 ");
		}
		return number - 10;
		
	}

}


// Section 10 / Lecture 28 [ Learn to to create your own Exception ] 





