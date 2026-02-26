package trainController;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("apples",30,100));
		carList.add(new Car("crabs",Integer.MAX_VALUE,10));
		System.out.println(carList.get(1).getCargo());
		System.out.println(carList.get(0).getQuantity());
		carList.get(0).setQuantity(82);
		System.out.println(carList.get(0).getQuantity());
		
		Train train1 = new Train("Thomas", 4, carList);
		train1.addCar(1, new Car("pencils", -2, 50));
		train1.removeCar(0);
		train1.printManifest();
	}
}
