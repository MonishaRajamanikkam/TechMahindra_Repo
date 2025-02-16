package Task1;

import java.util.*;

public class StudentMarkSorting {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Student> students = new ArrayList<>();

        // Accept student details
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter marks separated by spaces: ");
            int[] marks = Arrays.stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt) // Convert string to int array
                                .toArray();

            students.add(new Student(name, marks)); // Correct class reference
        }

        // Sort students by total marks in descending order
        students.sort(Comparator.comparingInt(s -> -s.total)); // Correct sorting

        // Display sorted student details
        System.out.println("\nSorted Student List (Based on Total Marks):");
        students.forEach(Student::display); // Using method reference

        scanner.close();
    }}