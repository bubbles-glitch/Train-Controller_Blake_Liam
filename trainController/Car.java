package trainController;

public class Car {
	private String cargo;
	private int quantity;
	private int weight;
	
	public Car(String c, int q, int w) {
		cargo = c;
		quantity = q;
		weight = w;
	}
	
	public String getCargo() {
		return cargo;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getWeight() {
		return weight;
	}
	public void setCargo(String s) {
		cargo = s;
	}
	public void setQuantity(int s) {
		quantity = s;
	}
	public void setWeight(int s) {
		weight = s;
	}
}
