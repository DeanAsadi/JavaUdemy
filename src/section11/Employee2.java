package section11;

public class Employee2 {
	
	String name;
	int salary;
	String department;
	
	public Employee2( String name, int salary, String department ) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		
	}
	
	public int compareTo(Employee2 o) {
		
		if( this.salary > o.salary ) {
			return -1;
		} else if ( this.salary < o.salary ) {
			return 1;
		}
		
		return 0;
	}

}
