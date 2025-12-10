package bpi.oop.activity6;

public class Car extends Vehicle {
	
	public Car(int numOfWheels, String brand) {
		this.setBrand(brand);
		this.setNumOfWheels(numOfWheels);
		System.out.println("Car: " + numOfWheels + " wheels " + brand);
	}
	
	public void startEngine() {
		System.out.println("Start Car Engine");
		
	}
	
	public void destroy() {
		System.out.println("Destroy Car");
	}
	
	public void refuel() {
		System.out.println("Refueling Car");
	}


	
	
}
