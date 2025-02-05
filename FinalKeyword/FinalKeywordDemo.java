package tm;

public class FinalKeywordDemo {
	public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass obj = new FinalClass();
        System.out.println("Max Speed: " + obj.getMaxSpeed());
        obj.showMessage();

        // Creating an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.engineStart();
    }
}
