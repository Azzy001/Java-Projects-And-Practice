package projects;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * This class represents a student management system.
 */
public class StudentOneObject {

    /**
     * Method to add a new student to the student database.
     * 
     * @param Students An ArrayList to store the list of students.
     * @param scanner  A Scanner object to take input from the user.
     */
    public static void addStudent(ArrayList<StudentOne> Students, Scanner scanner) {
        // Prompt the user to enter student details
        System.out.print("Firstname: ");
        String firstName = scanner.nextLine();

        System.out.print("Lastname: ");
        String lastName = scanner.nextLine();

        System.out.print("Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Contact number: ");
        String contactNumber = scanner.nextLine();

        // Create a new StudentOne object with the provided information
        StudentOne newStudent = new StudentOne(firstName, lastName, gender, contactNumber);
        // Add the new student to the ArrayList
        Students.add(newStudent);
    }

    /**
     * Main method to run the student management system.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList to store the list of students
        ArrayList<StudentOne> Students = new ArrayList<StudentOne>();

        // Print the welcome message
        System.out.println("\n----- Student Database --------------->\n");

        // Boolean flag to control the main menu loop
        boolean isRunning = true;
        while (isRunning) {
            // Display the main menu options
            System.out.println(
                    "----- Main Menu ---------->\n" +
                            "\nSelect options:\n" +
                            "1. view student database\n" +
                            "2. add student\n" +
                            "3. exit system");

            // Prompt the user to select an option
            int choice = scanner.nextInt();
            // Consume the newline character left by nextInt()
            scanner.nextLine();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // View the student database
                    for (StudentOne student : Students) {
                        student.describeStudent();
                    }
                    break;
                case 2:
                    // Add a new student
                    addStudent(Students, scanner);
                    break;
                case 3:
                    // Exit the system
                    System.out.println("Selected 3");
                    // Set the flag to exit the loop
                    isRunning = false;
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice.");
            }
        }

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
