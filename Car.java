package bpi.ootp1.activity3;

public class Car {
	private String color;
	private String make;
	private String model;
	
	public Car() {
		this.setColor("Red");
		this.setMake("Mazda");
		this.setModel("CX-5");
		
	}
	
	public Car(String color, String make, String model) {
		this.setColor(color);
		this.setMake(make);
		this.setModel(model);
	}
	
	//Setters
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setMake(String newMake) {
		this.make = newMake;
	}
	
	//GETTERS
	public String getColor() {
		return this.color;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	//METHOD
	public void drive (Car car) {
		System.out.println("I am driving a " + car.getColor() + " " + car.getMake() + " " + car.getModel());
	}

}
