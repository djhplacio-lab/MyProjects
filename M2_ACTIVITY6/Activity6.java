package bpi.oop.activity6;

public class Activity6 {

	public static void main(String[] args) {

		Vehicle car = new Car(4, "Honda");
		car.startEngine();
		car.refuel();
		
		Vehicle truck = new Truck(6, "Isuzu");
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
		
	}
	

	private static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}


}
