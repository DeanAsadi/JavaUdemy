package introOOP;

public class Zoo {
		
		String name;
		String eat;
		String sleep;
		
		public Zoo( String name, String eat, String sleep ) {
			super();
			this.name = name;
		
			this.eat = eat;
			this.sleep = sleep;	
		}
		
		

		public void specs() {
			System.out.println( name + " is an animal that " +  " his fave food is " + eat + " and he sleeps at " + sleep);
		}

	
}
