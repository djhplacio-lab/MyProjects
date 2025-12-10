package bpi.oop.activity6;

public abstract class Vehicle implements Refuelable{
	
	private String brand;
	private int numOfWheels;
	
	public Vehicle () {
		
	}
	
	public Vehicle(int numOfWheels, String brand) {
		this.brand = brand;
		this.numOfWheels = numOfWheels;
	}
	
	//setters
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getters
	public String getBrand() {
		return brand;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	

	public abstract void startEngine();
	
	public void destroy() {
		System.out.println("Destroy");
	}

}
