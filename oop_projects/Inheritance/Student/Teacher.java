/**
 * Represents a Teacher, extending the Person class.
 * Contains additional attributes specific to teachers such as department and salary.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person {
    // additional attributes specific to Teacher
    // the department the teacher belongs to
    private String department;
    // the salary of the teacher
    private double salary;
    
    public Teacher(String id, String forename, String surname, int age, String department, double salary) {
        // call to superclass constructor (Person)
        super(id, forename, surname, age);
        this.department = department;
        this.salary = salary;
    }

    // returns the email address of the student
    @Override
    public String getEmail(){
        // retrieves email from the superclass Person
        return super.getEmail();
    }
    
    // returns the department the teacher belongs to.
    public String getDepartment() {
        return department;
    }

    // sets the department the teacher belongs to
    public void setDepartment(String department) {
        this.department = department;
    }

    // returns the salary of the teacher
    public double getSalary() {
        return salary;
    }

    // sets the salary of the teacher
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Overrides the toString method to provide a string representation of the Teacher object.
     * Includes teacher-specific details such as department and salary.
     * 
     * @return String representation of the Teacher object.
     */
    @Override
    public String toString() {
        return super.toString() + String.format("\nDepartment: %s \nSalary: %.2f", department, salary);
    }
}
