package processingFiles;
import java.util.Scanner; // Scanner has all the read input methodaligies.

public class Application {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in); // To capture input
		System.out.println("Enter some data: ");
		String enteredText = input.nextLine(); // To take user input & store that input in a variable
		System.out.println(enteredText); // Print out that variable
		

	}

}
