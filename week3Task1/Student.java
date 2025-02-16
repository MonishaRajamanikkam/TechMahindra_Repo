package Task1;

import java.util.*;

public class Student {
	String name;
    int[] marks;
    int total;
    double average;
	// Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = calculateTotal(marks);
        this.average = (double) this.total / marks.length;
    }

    // Method to calculate total marks
    private int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Total: " + total + ", Average: " + String.format("%.2f", average));
    }
}
		
		
	


