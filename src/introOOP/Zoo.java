package introOOP;

public class Zoo {
		
		String name;
		String run;
		String fly;
		String eat;
		String sleep;
		
		public Zoo( String name, String run, String fly, String eat, String sleep ) {
			this.name = name;
			this.run = run;
			this.fly = fly;
			this.eat = eat;
			this.sleep = sleep;	
		}
		
		public void specs() {
			System.out.println( name + " is an animal that " + fly + run + " his fave food is " + eat + " and he sleeps at " + sleep);
		}

	
}
