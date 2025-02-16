package Task1;

import java.util.Arrays;
import java.util.List;

public class AlternativeElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 2, 6, 8, 3 };
		System.out.println("Even index elements:");
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Odd index elements:");
		for (int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}

}
