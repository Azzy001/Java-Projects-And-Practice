
/**
 * Write a description of class StudentTwo here.
 *
 * @author Arsalan Mohammad Arref
 * @version 19/05/2024x
 */
public class StudentTwo {
    // class attributes
    private String firstName;
    private String lastName;
    private String email;
    private String module;
    private int enrollmentYear;
    
    // constructor
    public StudentTwo(String firstName, String lastName, String module, int enrollmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = String.format("%s.%s@student.ac.uk", firstName.toLowerCase(), lastName.toLowerCase());
        this.module = module;
        this.enrollmentYear = enrollmentYear;
    }
    
    // get and set firstname
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
        this.email = String.format("%s.%s@student.ac.uk", this.firstName.toLowerCase(), this.lastName.toLowerCase());
    }
    
    // get and set lastname
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
        this.email = String.format("%s.%s@student.ac.uk", this.firstName.toLowerCase(), this.lastName.toLowerCase());
    }
    
    // get email
    public String getEmail(){
        return this.email;
    }

    // get and set module
    public String getModule(){
        return this.module;
    }
    public void setModule(String module){
        this.module = module;
    }
    
    // get and set enrollment year
    public int getEnrollmentYear(){
        return this.enrollmentYear;
    }
    public void setEnrollmentYear(int enrollmentYear){
        this.enrollmentYear = enrollmentYear;
    }
    
    @Override
    public String toString(){
        return String.format("StudentTwo{name='%s %s', email='%s', module='%s', enrollment year='%s'}",
                            this.firstName, this.lastName, this.email, this.module, this.enrollmentYear);
    }
}
