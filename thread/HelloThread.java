package thread;

public class HelloThread extends Thread {
	
	    @Override
	    public void run() {
	        System.out.println("Hello Java!!!!!");
	    }

	    public static void main(String[] args) {
	        HelloThread thread = new HelloThread();
	        thread.start();
	    }
	}


