package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("1234 Royal Oak");
		cust1.setCashOnHand(10000);
		
		Vehicle vehicle = new Vehicle();
		Employee employee = new Employee();
		
		
		cust1.purchaseCar(vehicle, employee, false);
	}

}
