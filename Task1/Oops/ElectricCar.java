package tm;

public class ElectricCar extends Car{
	// Subclass ElectricCar extending Car
		
		    // Additional instance variable for battery range
		    private int batteryRange;

		    // Constructor
		    public ElectricCar(String make, String model, int year, int batteryRange) {
		        super(make, model, year);
		        this.batteryRange = batteryRange;
		    }

		    // Getter for battery range
		    public int getBatteryRange() {
		        return batteryRange;
		    }

		    // Setter for battery range
		    public void setBatteryRange(int batteryRange) {
		        this.batteryRange = batteryRange;
		    }

		    // Override the startEngine method to provide specific behavior for electric cars
		    @Override
		    public void startEngine() {
		        System.out.println("The electric engine of the " + getYear() + " " + getMake() + " " + getModel() + " has started silently.");
		    }

		    // Method to charge the battery
		    public void chargeBattery() {
		        System.out.println("The battery of the " + getYear() + " " + getMake() + " " + getModel() + " is being charged.");
		    }
		}

		
		


	



