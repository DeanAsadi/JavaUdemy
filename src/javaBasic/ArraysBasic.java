package javaBasic;

public class ArraysBasic {

	public static void main(String[] args) {
		
		int[] value = new int[100]; // Values is TYPE int, stores 100 slots
		value[0] = 1000; // store number 1000 in index [0]
//		System.out.println(value);
		
		String[] words = new String[] { "This", "is", "test" };
		System.out.println(words[2]);
		
		String[] newWord = new String[1]; // Will only store 2 slots
		newWord[0] = "Hello";
		newWord[1] = "World";
		
		 newWord = new String[4]; // Now we can change it to store 5 slots
		// but it won't take up the 2 old values, old data is gone :(
		 System.out.println(newWord);
		
		
	}

}
