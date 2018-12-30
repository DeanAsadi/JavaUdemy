package section11;

public class Animals {
	
	String animal;
	int age;
	
	public Animals ( String animal, int age ) {
		super();
		this.animal = animal;
		this.age = age;
		
	}

//	@Override Generateing Hash code and equals
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		return result;
	}

//	@Override Generateing Hash code and equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animals other = (Animals) obj;
		if (age != other.age)
			return false;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		return true;
	}

}
