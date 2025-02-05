package tm;

public class Car {
	    // Base class Car
	    // Private instance variables
	    private String make;
	    private String model;
	    private int year;

	    // Constructor
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }
	    // Getter methods
	    public String getMake() {
	        return make;
	    }
	    public String getModel() {
	        return model;
	    }
	    public int getYear() {
	        return year;
	    }
	    // Setter methods
	    public void setMake(String make) {
	        this.make = make;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }
	    // Method to start the engine
	    public void startEngine() {
	        System.out.println("The engine of the " + year + " " + make + " " + model + " has started.");
	    }
	}

	
