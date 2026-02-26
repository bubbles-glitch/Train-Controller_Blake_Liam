package trainController;

import java.util.ArrayList;

public class Train {
	private String name;
	private int lineNumber;
	private ArrayList<Car> cars;
	
	public Train(String n, int ln, ArrayList<Car> c) {
		name = n;
		lineNumber = ln;
		cars = c;
	}
	
	public String getName() {
		return name;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setName(String n) {
		name = n;
	}
	public void setLineNumber(int n) {
		lineNumber = n;
	}
	
	public ArrayList<Car> addCar(int i, Car c) {
		cars.add(i,c);
		return cars;
	}
	public Car removeCar(int i) {
		return cars.remove(i);
	}
	public Car getCar(int i) {
		return cars.get(i);
	}
	
	public int getTotalWeight() {
		int totalWeight = 0;
		for (Car i : cars) {
			totalWeight += i.getWeight();
			
		}
		return totalWeight;
	}
	public void printManifest() {
	    System.out.println("=== TRAIN MANIFEST ===");
	    System.out.println("Train Name: " + name);
	    System.out.println("Line Number: " + lineNumber);
	    System.out.println("Number of Cars: " + cars.size());
	    System.out.println();

	    for (int i = 0; i < cars.size(); i++) {
	    	Car temp = cars.get(i);
	        System.out.println("Car " + i + ": " + temp.getCargo() + ", " + temp.getQuantity() + ", " + temp.getWeight());
	    }

	    System.out.println();
	    System.out.println("Total Weight: " + getTotalWeight());
	    System.out.println("======================");
	}
}
