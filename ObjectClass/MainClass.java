package override;

public class MainClass {
	    public static void main(String[] args) {
	        // Creating User objects (Overridden methods)
	        User user1 = new User("Moni", 20);
	        User user2 = new User("Priya", 25);
	        
	        // Creating SecondUser objects (Without overrides)
	        SecondUser secondUser1 = new SecondUser("Moni", 20);
	        SecondUser secondUser2 = new SecondUser("Priya", 25);

	        // Comparing objects using equals()
	        System.out.println("User class (Overridden equals): " + user1.equals(user2)); // True
	        System.out.println("SecondUser class (Default equals): " + (secondUser1 == secondUser2)); // False

	        // Printing objects using toString()
	        System.out.println("User class (Overridden toString): " + user1); // Prints meaningful info
	        System.out.println("SecondUser class (Default toString): " + secondUser1); // Prints memory reference

	        // Comparing hashCode values
	        System.out.println("User hashCode: " + user1.hashCode() + " vs " + user2.hashCode()); // Same hash code
	    }
	}


