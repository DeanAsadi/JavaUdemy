package javaBasic;

public class Exercise {

	public static void main(String[] args) {
		
		String str = "We have large inventory of things in our warehouse falling in " 
					  + "the category:apperal and the slightly "
					  + "more in demand category:makeup along with the category:furniture and _.";
		
		printCategories(str);

	}
	
	// extract all categories from the string argument
	public static void printCategories(String str) {
		
		int count = 0;
		
		
		while(true) {
			int found = str.indexOf("category:", count);
			if(found == -1) break;
			int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			count +=  end;
			
		}
		
		
	}
	
}


