package processingFiles;
import java.io.File;
import java.io.FileNotFoundException; // To reding files and throw exceptions.
import java.util.Scanner; // Scanner has all the read input methodaligies.



public class Application {

	public static void main(String[] args) {
		
//		for ( int i = 0; i < 4; i++ ) { // We can also wrap it in a loop to excute it more then once
//			Scanner input = new Scanner (System.in); // To capture input
//			System.out.println("Enter some data: ");
//			String enteredText = input.nextLine(); // To take user input & store that input in a variable
//			System.out.println(enteredText); // Print out that variable
//		}
	
		try {
			File file = new File("myFile.txt");
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
			
		} catch (FileNotFoundException e) { // We can make our own Exception methods
			System.out.println("File was not found ");
			
		}
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.myFirstExceptionMethod(11));
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}

}

