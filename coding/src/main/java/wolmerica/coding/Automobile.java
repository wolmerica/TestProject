package wolmerica.coding;

public abstract class Automobile {
	
	public void retailPrice(int price) {
		System.out.println("The retail price of this vehicle is " + price);
	}
	public abstract void wheelDrive();
	
	public abstract void passengerCapacity();
	
	public abstract void propulsionType();
	
	public abstract void efficiencyRate();

}
