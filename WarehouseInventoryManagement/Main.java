package WarehouseInventoryManagement;
	import java.util.Arrays;

	public class Main {
	    public static void main(String[] args) {
	        InventoryManager manager = new InventoryManager();

	        // Add products
	        manager.addProduct(new Product("P1", "Laptop", 100, new Location(1, 2, 3)));
	        manager.addProduct(new Product("P2", "Phone", 50, new Location(2, 1, 1)));

	        // Show inventory before processing
	        System.out.println("Initial Inventory:");
	        manager.showInventory();

	        // Place orders
	        manager.placeOrder(new Order("O1", Arrays.asList("P1"), Order.Priority.EXPEDITED));
	        manager.placeOrder(new Order("O2", Arrays.asList("P2"), Order.Priority.STANDARD));

	        // Wait for order processing
	        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

	        // Show inventory after processing
	        System.out.println("\nUpdated Inventory:");
	        manager.showInventory();
	    }
	}


