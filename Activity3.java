package bpi.ootp1.activity3;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car("white", "Honda" , "Civic");
		
		car1.drive(car1);
		car2.drive(car2);
		
	}

}
