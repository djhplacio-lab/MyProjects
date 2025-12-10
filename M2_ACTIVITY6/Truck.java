package bpi.oop.activity6;

public class Truck extends Vehicle {
	
	public Truck(int numOfWheels, String brand) {
		this.setBrand(brand);
		this.setNumOfWheels(numOfWheels);
		System.out.println("Truck: " + numOfWheels + " wheels " + brand);
	}
	
	public void startEngine() {
		System.out.println("Start Truck Engine");
		
	}
	
	public void destroy() {
		System.out.println("Destroy Truck");
	}
	
	public void refuel() {
		System.out.println("Refueling Truck");
	}

}
