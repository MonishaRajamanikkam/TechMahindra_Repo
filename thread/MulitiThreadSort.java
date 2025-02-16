package thread;
import java.util.Arrays;
public class MulitiThreadSort {
	    private static int[] array = {0, 2, 9, 1, 9, 6, 3, 7, 8, 4};

	    public static void main(String[] args) {
	        int mid = array.length / 2;
	        int[] left = Arrays.copyOfRange(array, 0, mid);
	        int[] right = Arrays.copyOfRange(array, mid, array.length);

	        Thread leftSorter = new Thread(new Sorter(left));
	        Thread rightSorter = new Thread(new Sorter(right));

	        leftSorter.start();
	        rightSorter.start();

	        try {
	            leftSorter.join();
	            rightSorter.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        merge(left, right, array);

	        System.out.println("Sorted Array: " + Arrays.toString(array));
	    }

	    private static void merge(int[] left, int[] right, int[] result) {
	        int i = 0, j = 0, k = 0;
	        while (i < left.length && j < right.length) {
	            result[k++] = (left[i] < right[j]) ? left[i++] : right[j++];
	        }
	        while (i < left.length) {
	            result[k++] = left[i++];
	        }
	        while (j < right.length) {
	            result[k++] = right[j++];
	        }
	    }
	}

	class Sorter extends Thread {
	    private int[] array;

	    public Sorter(int[] array) {
	        this.array = array;
	    }

	    @Override
	    public void run() {
	        Arrays.sort(array);
	    }
	}


