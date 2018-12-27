package processingFiles;
import java.io.*; // This will import all (java.io files)

// The correct way to create (try & catch) for reading files and print themout to the screen.
public class Application2 {

	public static void main(String[] args)  {
		
		File file = new File("myFile2.txt");
		
		try( FileReader fileReader = new FileReader(file);
			 BufferedReader bufferdReader = new BufferedReader(fileReader); ){
			
			String line = bufferdReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferdReader.readLine();
			}
			
		}catch( FileNotFoundException e) {
			System.out.println("File was not found....");
		} catch (IOException e) {
			System.out.println("Problem with the file " + file.getName());
		}
		
	}

}
