package processingFiles;

public class MyFileUtils {
	public int myFirstExceptionMethod( int number ) throws Exception {
		
		if( number < 10 ) {
			throw new Exception (" The number passed in was smaller then 10 ");
		}
		return number - 10;
		
	}

}
