package section11;

public class Vehicle {
	
	String make;
	String modle;
	int price;
	boolean fourWhealDrive;
	
	
	public Vehicle ( String make, String modle, int price, boolean fourWhealDrive ) {
		super();
		
		this.make = make;
		this.modle = modle;
		this.price = price;
		this.fourWhealDrive = fourWhealDrive;
	}


	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", modle=" + modle + ", price=" + price + ", fourWhealDrive=" + fourWhealDrive
				+ "]";
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModle() {
		return modle;
	}


	public void setModle(String modle) {
		this.modle = modle;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public boolean isFourWhealDrive() {
		return fourWhealDrive;
	}


	public void setFourWhealDrive(boolean fourWhealDrive) {
		this.fourWhealDrive = fourWhealDrive;
	}


	

}
