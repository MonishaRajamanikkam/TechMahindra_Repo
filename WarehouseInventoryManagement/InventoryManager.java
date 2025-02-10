package WarehouseInventoryManagement;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
public class InventoryManager {
	    private ConcurrentHashMap<String, Product> inventory = new ConcurrentHashMap<>();
	    private PriorityBlockingQueue<Order> orderQueue = new PriorityBlockingQueue<>();

	    public void addProduct(Product product) {
	        inventory.put(product.getProductID(), product);
	    }

	    public synchronized void processOrder(Order order) {
	        try {
	            for (String productID : order.getProductIDs()) {
	                Product product = inventory.get(productID);
	                if (product == null || product.getQuantity() <= 0) {
	                    throw new OutOfStockException("Product " + productID + " is out of stock!");
	                }
	                product.reduceQuantity(1);
	                System.out.println("Processed order " + order.getOrderID() + " for " + product.getName());
	            }
	        } catch (OutOfStockException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void startOrderProcessing() {
	        while (!orderQueue.isEmpty()) {
	            processOrder(orderQueue.poll());
	        }
	    }

	    public void placeOrder(Order order) {
	        orderQueue.add(order);
	        new Thread(this::startOrderProcessing).start();
	    }

	    public void showInventory() {
	        inventory.values().forEach(System.out::println);
	    }
	}


