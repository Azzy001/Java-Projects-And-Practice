package projects;
// This is a Java class representing a student.

// It stores information about a student such as their name, gender, email, contact number, and date of birth.
// The student ID is automatically generated using a random number generator.

// Import necessary libraries
import java.util.Random;
import java.time.LocalDate;

// The StudentOne class definition begins
public class StudentOne {
    // Declaring instance variables to store student information
    private String studentId; // Student ID
    private String firstName; // First name
    private String lastName; // Last name
    private String gender; // Gender
    private String email; // Email address
    private String contactNumber; // Contact number
    private LocalDate dateOfBirth; // Date of birth
    

    // Constructor without parameters
    // Generates a random student ID when a StudentOne object is created
    public StudentOne() {
        this.studentId = generateRandomStudentId();
    }

    // Constructor with parameters
    public StudentOne(String firstName, String lastName, String gender, String contactNumber) {
        // Generate a random student ID
        this.studentId = generateRandomStudentId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        // Construct email using first and last name (assuming a university email
        // format)
        this.email = String.format("%s.%s@northumbria.ac.uk", this.firstName.toLowerCase(),
                this.lastName.toLowerCase());
        this.contactNumber = contactNumber;
    }

    // Getter method for student ID
    public String getStudentId() {
        return this.studentId;
    }

    // Private method to generate a random student ID
    private String generateRandomStudentId() {
        // Create a random number generator object
        Random generator = new Random();
        // Generate a random 5-digit number
        int randomId = generator.nextInt(99999) + 10000;
        // Convert the random number to a string and return it
        return String.valueOf(randomId);
    }

    // Getter method for first name
    public String getFirstName() {
        return this.firstName;
    }

    // Setter method for first name
    // Also updates the email address when the first name is set
    public void setFirstName(String firstName) {
        this.firstName = firstName; // Set the first name
        // Update the email address using the new first name and existing last name
        this.email = String.format("%s.%s@northumbria.ac.uk", this.firstName.toLowerCase(),
                this.lastName.toLowerCase());
    }

    // Getter method for last name
    public String getLastName() {
        return this.lastName;
    }

    // Setter method for last name
    // Also updates the email address when the last name is set
    public void setLastName(String lastName) {
        this.lastName = lastName; // Set the last name
        // Update the email address using the existing first name and new last name
        this.email = String.format("%s.%s@northumbria.ac.uk", this.firstName.toLowerCase(),
                this.lastName.toLowerCase());
    }

    // Getter method for gender
    public String getGender() {
        return this.gender;
    }

    // Setter method for gender
    public void setGender(String gender) {
        this.gender = gender; // Set the gender
    }

    // Getter method for email address
    public String getEmail() {
        return this.email;
    }

    // Getter method for contact number
    public String getContactNumber() {
        return this.contactNumber;
    }

    // Setter method for contact number
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber; // Set the contact number
    }

    // Getter method for date of birth
    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    // Setter method for date of birth
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth; // Set the date of birth
    }

    // Method to print student information
    public void describeStudent() {
        System.out.println("\nStudent ID: " + this.studentId +
                "\nFirst Name: " + this.firstName +
                "\nLast Name: " + this.lastName +
                "\nGender: " + this.gender +
                "\nEmail: " + this.email +
                "\nContact Number: " + this.contactNumber +
                "\nDate of Birth: " + this.dateOfBirth + "\n");
    }
    // The StudentOne class definition ends
}
