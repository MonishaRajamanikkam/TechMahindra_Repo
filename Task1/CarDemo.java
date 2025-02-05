package tm;
//Main class to demonstrate polymorphism
public class CarDemo {
	    public static void main(String[] args) {
	        // Creating an array of Car objects, including both Car and ElectricCar
	        Car[] cars = new Car[3];
	        cars[0] = new Car("Toyota", "Camry", 2021);
	        cars[1] = new ElectricCar("Tesla", "Model 3", 2021, 300);
	        cars[2] = new Car("Honda", "Accord", 2022);

	        // Looping through the array and calling startEngine() on each object
	        for (Car car : cars) {
	            car.startEngine(); // Demonstrates polymorphism
	        }
	    }
	}


