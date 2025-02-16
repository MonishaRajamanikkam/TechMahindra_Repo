package thread;
import java.util.ArrayList;
import java.util.List;


public class PrimeSumCalculator {
	
	    static int limit = 200;
	    static int numThreads = 4;
	    static long totalSum = 0;

	    public static void main(String[] args) {
	        List<Thread> threads = new ArrayList<>();
	        int chunkSize = limit / numThreads;

	        for (int i = 0; i < numThreads; i++) {
	            int start = i * chunkSize + 1;
	            int end = (i == numThreads - 1) ? limit : (i + 1) * chunkSize;
	            Thread thread = new PrimeSumThread(start, end);
	            threads.add(thread);
	            thread.start();
	        }

	        for (Thread thread : threads) {
	            try {
	                thread.join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
	    }

	    synchronized static void addToTotalSum(long sum) {
	        totalSum += sum;
	    }
	}

